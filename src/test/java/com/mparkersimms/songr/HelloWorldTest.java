package com.mparkersimms.songr;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void contextLoads(){
    }

    @Test
    void HellowWorldTest() throws Exception{
        mockMvc.perform(get("/hello"))
                .andExpect(content().string(containsString("<h1>Hello World!</h1>")))
                .andExpect(content().string(containsString("<p>Its a new hello world!</p>")))
                .andExpect(status().isOk());
    }


}
