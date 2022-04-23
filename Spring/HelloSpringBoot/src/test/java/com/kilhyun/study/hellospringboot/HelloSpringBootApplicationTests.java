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

        // Object to Text
        var user = new User("slykid", 30, "010-1234-5678");
        var text = objectMapper.writeValueAsString(user);
        System.out.println(text);

        // Text to Object
        // Object Mapper 는 default 생성자를 필요로 함
        var objectUser = objectMapper.readValue(text, User.class);
        System.out.println(objectUser);
    }

}
