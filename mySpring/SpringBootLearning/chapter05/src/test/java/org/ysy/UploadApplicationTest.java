package org.ysy;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.ysy.controller.UploadController;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = UploadApplication.class)
public class UploadApplicationTest {

    private MockMvc mvc;

    @Before
    public void setup(){
        mvc = MockMvcBuilders.standaloneSetup(new UploadController()).build();
    }

    @Test
    public void getUpload() throws Exception {
        MockMultipartFile file = new MockMultipartFile(
                "file",
                "hello.txt",
                MediaType.TEXT_PLAIN_VALUE,
                "Hello, World!".getBytes()
        );

        final MvcResult result = mvc.perform(
                        MockMvcRequestBuilders
                                .multipart("/upload")
                                .file(file))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();
    }
}