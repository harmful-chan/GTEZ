package com.wimoor.aliexpress.controller;

import com.global.iop.util.ApiException;
import com.wimoor.aliexpress.pojo.entity.AccessToken;
import com.wimoor.aliexpress.service.IAliexpresAuthorityService;
import com.wimoor.common.result.Result;
import com.wimoor.common.user.UserInfo;
import com.wimoor.common.user.UserInfoContext;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
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
    public ModelAndView getAuthorityCode(String code, ModelMap map) {
        map.addAttribute("code", code);
        return new ModelAndView("index");
    }

    @GetMapping("/createToken")
    public Result<AccessToken> createToken(String code, String account, boolean isOverride) {
        try{
            AccessToken tokenByCode = iAliexpresAuthorityService.createToken(code, account, isOverride);
            return Result.success(tokenByCode);
        }catch (ApiException exception){
            return Result.failed(exception.getMessage());
        }
    }
    @GetMapping("/getToken")
    public Result<AccessToken> getTokenByAccount(String account) {
        AccessToken token = iAliexpresAuthorityService.getTokenByAccount(account);
        return Result.success(token);
    }

}
