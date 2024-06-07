package com.wimoor.aliexpress.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.global.iop.api.IopClient;
import com.global.iop.api.IopRequest;
import com.global.iop.api.IopResponse;
import com.global.iop.domain.Protocol;
import com.global.iop.util.ApiException;
import com.wimoor.aliexpress.common.IopClientManager;
import com.wimoor.aliexpress.mapper.AccessTokenMapper;
import com.wimoor.aliexpress.pojo.entity.AccessToken;
import com.wimoor.aliexpress.service.IAliexpresAuthorityService;
import com.wimoor.common.GeneralUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AliexpresAuthorityServiceImpl extends ServiceImpl<AccessTokenMapper, AccessToken> implements IAliexpresAuthorityService {
    @Value("${aliexpress.api.appKey}")
    private String appKey;

    @Value("${aliexpress.api.callback.url}")
    private String callbackUrl;

    @Autowired
    private IopClientManager iopClientManager;

    @Override
    public String getAuthorityUrl() {
        return "https://api-sg.aliexpress.com/oauth/authorize?response_type=code&force_auth=true&redirect_uri="
                + callbackUrl +"&client_id=" + appKey;
    }

    @Override
    public AccessToken createToken(String code, String account, boolean isOverride) throws ApiException {
        AccessToken dbTk = null;
        IopClient iopClient = null;
        try {
            List<AccessToken> accessTokens = this.baseMapper.selectList(Wrappers.<AccessToken>lambdaQuery().eq(AccessToken::getAccount, account));
            if(!accessTokens.isEmpty()){
                dbTk = accessTokens.get(accessTokens.size()-1);
            }

            if(dbTk ==null){
                // 创建token
                iopClient = iopClientManager.borrowClient();
                IopRequest request = new IopRequest();
                request.setApiName("/auth/token/create");
                request.addApiParameter("code", code);
                IopResponse response = iopClient.execute(request, Protocol.GOP);
                String body = response.getGopResponseBody();
                String gopErrorCode = response.getGopErrorCode();
                JSONObject json = GeneralUtil.getJsonObject(body);
                AccessToken token = JSONObject.toJavaObject(json, AccessToken.class);

                // 接口访问错误
                if( token == null || !"0".equals(gopErrorCode)  ){
                    throw new ApiException(" /auth/token/create " + gopErrorCode + " " + account);
                }
                if(dbTk == null){
                    this.baseMapper.insert(token);
                }else {
                    // 存在则更新
                    BeanUtil.copyProperties(token, dbTk);
                    this.baseMapper.updateById(dbTk);
                }
                return  token;
            }else{
                // 过期则刷单token
                if( isOverride || Integer.parseInt( dbTk.getExpiresIn())  <= 0)
                {
                    // 更新
                    iopClient = iopClientManager.borrowClient();
                    IopRequest request = new IopRequest();
                    request.setApiName("/auth/token/refresh");
                    request.addApiParameter("refresh_token", dbTk.getRefreshToken());
                    IopResponse response = iopClient.execute(request, Protocol.GOP);
                    String body = response.getGopResponseBody();
                    String gopErrorCode = response.getGopErrorCode();

                    JSONObject json = GeneralUtil.getJsonObject(body);
                    AccessToken token = JSONObject.toJavaObject(json, AccessToken.class);
                    // 接口访问错误
                    if( token == null || !"0".equals(gopErrorCode)  ){
                        throw new ApiException(" /auth/token/refresh " + gopErrorCode + " "+account);
                    }
                    BeanUtil.copyProperties(token, dbTk);
                    this.baseMapper.updateById(dbTk);
                    return token;
                }else {  // 返回原始code
                    return dbTk;
                }
            }
        } catch (ApiException e) {
            throw e;
        }catch (Exception e) {
            // e.printStackTrace();
        } finally {
            if (iopClient != null) {
                iopClientManager.returnClient(iopClient);
            }
        }
        return null;
    }


    @Override
    public AccessToken getTokenByAccount(String account) {
        AccessToken accessToken = this.baseMapper.selectOne(Wrappers.<AccessToken>lambdaQuery().eq(AccessToken::getAccount, account));
        return accessToken;
    }
}
