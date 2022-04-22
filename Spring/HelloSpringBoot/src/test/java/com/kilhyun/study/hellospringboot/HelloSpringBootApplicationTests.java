package com.kilhyun.study.hellospringboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kilhyun.study.hellospringboot.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

    @Test
    void contextLoads() throws JsonProcessingException {
        System.out.println("------------------------");

        var objectMapper = new ObjectMapper();

        // Object to text
        var user = new User("slykid", 30);
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

    }

}
