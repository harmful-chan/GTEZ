package com.wimoor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.wimoor.util.SpringUtil;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCaching
@EnableScheduling
@EnableTransactionManagement
public class AliexpressApplication {

    public static void main(String[] args) {
        try {
            ConfigurableApplicationContext context = SpringApplication.run(AliexpressApplication.class, args);
            SpringUtil.set(context);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
