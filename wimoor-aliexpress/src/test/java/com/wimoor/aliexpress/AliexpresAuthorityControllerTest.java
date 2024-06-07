package com.wimoor.aliexpress;

import com.wimoor.aliexpress.controller.AliexpresAuthorityController;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.logging.Logger;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
public class AliexpresAuthorityControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void testGetAuthorityPage() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

        // 跳转认证页面
        MvcResult mvcResult = mockMvc.perform(get("/api/v1/aliexpressauthority/getAuthorityPage")).andReturn();
        MockHttpServletResponse response = mvcResult.getResponse();
        String location = (String) response.getHeaderValue("Location");
        System.out.println(location);
        Assertions.assertTrue( location.startsWith("https://api-sg.aliexpress.com"));

    }
}
