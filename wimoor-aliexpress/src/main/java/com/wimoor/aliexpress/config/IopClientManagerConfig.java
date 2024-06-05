package com.wimoor.aliexpress.config;

import com.wimoor.aliexpress.common.IopClientManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IopClientManagerConfig {

    @Value("${aliexpress.api.url}")
    private String url;

    @Value("${aliexpress.api.appKey}")
    private String appKey;


    @Value("${aliexpress.api.appSecret}")
    private String appSecret;


    @Bean
    public IopClientManager iopClientManager() {
        return new IopClientManager(url, appKey, appSecret);
    }
}

