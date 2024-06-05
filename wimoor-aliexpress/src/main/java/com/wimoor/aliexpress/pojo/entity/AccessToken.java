package com.wimoor.aliexpress.pojo.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.wimoor.common.pojo.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_access_token")
public class AccessToken extends BaseEntity implements Serializable  {

    @TableField(value = "refresh_token_valid_time")
    private String refreshTokenValidTime;

    @TableField(value = "havana_id")
    private String havanaId;

    @TableField(value = "code")
    private String code;

    @TableField(value = "expire_time")
    private String expireTime;

    @TableField(value = "locale")
    private String locale;

    @TableField(value = "user_nick")
    private String userNick;

    @TableField(value = "access_token")
    private String accessToken;

    @TableField(value = "refresh_token")
    private String refreshToken;

    @TableField(value = "account_id")
    private String accountId;

    @TableField(value = "user_id")
    private String userId;

    @TableField(value = "account_platform")
    private String accountPlatform;

    @TableField(value = "refresh_expires_in")
    private String refreshExpiresIn;

    @TableField(value = "expires_in")
    private String expiresIn;

    @TableField(value = "sp")
    private String sp;

    @TableField(value = "request_id")
    private String requestId;

    @TableField(value = "seller_id")
    private String sellerId;

    @TableField(value = "account")
    private String account;
}

