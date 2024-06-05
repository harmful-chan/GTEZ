package com.wimoor.aliexpress.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.global.iop.api.IopClient;
import com.global.iop.api.IopRequest;
import com.global.iop.api.IopResponse;
import com.global.iop.domain.Protocol;
import com.wimoor.aliexpress.common.IopClientManager;
import com.wimoor.aliexpress.mapper.AccessTokenMapper;
import com.wimoor.aliexpress.pojo.entity.AccessToken;
import com.wimoor.aliexpress.service.IAliexpresAuthorityService;
import com.wimoor.common.GeneralUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("AliexpresAuthorityService")
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
    public AccessToken createTokenByCode(String code) {
        IopClient iopClient = null;
        try {

            // 创建token
            iopClient = iopClientManager.borrowClient();
            IopRequest request = new IopRequest();
            request.setApiName("/auth/token/create");
            request.addApiParameter("code", code);
            IopResponse response = iopClient.execute(request, Protocol.GOP);
            String body = response.getGopResponseBody();
            AccessToken token = GeneralUtil.parse(body, AccessToken.class);


//            if (token != null){  // token 不存在
//                this.baseMapper.insert(token);
//            }else {
//                Integer expiresIn = Integer.parseInt(accessToken.getExpiresIn());
//                if(expiresIn <= 0){  //
//                    refreshTokenByAccount(account);
//                }
//                AccessToken at = this.baseMapper.selectByAccount(account);
//                return at;
//            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (iopClient != null) {
                iopClientManager.returnClient(iopClient);
            }
        }
        return null;
    }

    @Override
    public void refreshTokenByAccount(String account) {
        IopClient iopClient = null;
        try {

            AccessToken accessToken = this.baseMapper.selectByAccount(account);
            if (accessToken != null){  // token 存在
                // 创建token
                iopClient = iopClientManager.borrowClient();
                IopRequest request = new IopRequest();
                request.setApiName("/auth/token/refresh");
                request.addApiParameter("refresh_token", accessToken.getRefreshToken());
                IopResponse response = iopClient.execute(request, Protocol.GOP);
                String body = response.getGopResponseBody();
                AccessToken token = GeneralUtil.parse(body, AccessToken.class);
                BeanUtil.copyProperties(token, accessToken);
                this.baseMapper.updateById(accessToken);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (iopClient != null) {
                iopClientManager.returnClient(iopClient);
            }
        }
    }

    @Override
    public AccessToken getTokenByAccount(String account) {
        AccessToken accessToken = this.baseMapper.selectByAccount(account);
        return accessToken;
    }
}
