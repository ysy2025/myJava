package com.ysy.chapter01;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;


/*
使用MockServletContext来构建一个空的WebApplicationContext，
这样我们创建的HelloController就可以在@Before函数中创建并传递到MockMvcBuilders.standaloneSetup()函数中。

 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter01ApplicationTest {

    private MockMvc mvc;

    @Before // 先执行的步骤
    public void setUp() throws Exception{
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }

    @Test
    public void getHello() throws Exception{
//        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
        mvc.perform(MockMvcRequestBuilders.get("/hello").
                accept(MediaType.APPLICATION_JSON)).
                andExpect(status().isOk()).
                andExpect(content().string(equalTo("Hello World!")));
        // 这里的string什么的,要和controller里面的完全一致才行,有一点差距都会报错
    }


}