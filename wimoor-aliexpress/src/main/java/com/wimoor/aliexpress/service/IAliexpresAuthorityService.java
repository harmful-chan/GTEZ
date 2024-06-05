package com.wimoor.aliexpress.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wimoor.aliexpress.pojo.entity.AccessToken;

public interface IAliexpresAuthorityService extends IService<AccessToken> {
    public  String  getAuthorityUrl();

    AccessToken createTokenByCode(String code);

    void refreshTokenByAccount(String account);

    AccessToken getTokenByAccount(String account);
}
