package com.wimoor.aliexpress.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.global.iop.util.ApiException;
import com.wimoor.aliexpress.pojo.entity.AccessToken;

public interface IAliexpresAuthorityService extends IService<AccessToken> {
    public  String  getAuthorityUrl();

     AccessToken createToken(String code, String account, boolean isOverride) throws ApiException;


    AccessToken getTokenByAccount(String account);
}
