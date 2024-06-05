package com.wimoor.aliexpress.controller;

import com.wimoor.aliexpress.pojo.entity.AccessToken;
import com.wimoor.aliexpress.service.IAliexpresAuthorityService;
import com.wimoor.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Api(tags = "授权接口")
@RestController
@RequestMapping("/api/v1/aliexpressauthority")
@Component("aliexpressauthorityController")
@Slf4j
@RequiredArgsConstructor
public class AliexpresAuthorityController {

    @Autowired
    IAliexpresAuthorityService iAliexpresAuthorityService;


    @ApiOperation(value = "获取回调链接")
    @GetMapping("/getAuthorityPage")
    public RedirectView getAuthorityPage(HttpServletResponse response) throws IOException {
        String url = iAliexpresAuthorityService.getAuthorityUrl();

        return new RedirectView(url);
    }

    @GetMapping("/getAuthorityCode")
    public Result<AccessToken> getAuthorityCode(String code) {

        AccessToken tokenByCode = iAliexpresAuthorityService.createTokenByCode(code);
        return Result.success(tokenByCode);
    }


}
