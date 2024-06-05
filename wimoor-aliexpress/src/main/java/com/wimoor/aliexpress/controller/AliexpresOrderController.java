package com.wimoor.aliexpress.controller;

import com.wimoor.common.result.Result;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "订单接口")
@RestController
@RequestMapping("/api/v1/order")
@Component("aliexpressOrderController")
@Slf4j
@RequiredArgsConstructor
public class AliexpresOrderController {

    @GetMapping("/refreshOrder")
    public Result<String> refreshOrder(String code) {
        return Result.success(code);
    }
}
