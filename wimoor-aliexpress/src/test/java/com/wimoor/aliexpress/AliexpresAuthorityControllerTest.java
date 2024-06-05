package com.wimoor.aliexpress;

import com.wimoor.aliexpress.controller.AliexpresAuthorityController;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
public class AliexpresAuthorityControllerTest {

    @Autowired
    private static WebApplicationContext webApplicationContext;

    MockMvc mockMvc;
    @BeforeAll
    public static void before(){
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testGreet() throws Exception {
        mockMvc.perform(get("/api/v1/aliexpressauthority/getAuthorityPage"))
                .andExpect(status().is3xxRedirection())
                .andExpect(header().string("Location", "https://api-sg.aliexpress.com"));
    }
}
