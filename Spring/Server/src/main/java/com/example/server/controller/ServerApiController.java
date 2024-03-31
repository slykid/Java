package com.example.server.controller;

import com.example.server.dto.Req;
import com.example.server.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.buf.Utf8Encoder;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
@RestController
@RequestMapping("/api/server")
public class ServerApiController {

    @GetMapping("/naver")
    public String naver() {

        String query = "갈비집";

        URI uri = UriComponentsBuilder
                .fromUriString("https://openapi.naver.com")
                .path("/v1/search/local.json")
                .queryParam("query", query)
                .queryParam("display", 10)
                .queryParam("start", 1)
                .queryParam("sort", "random")
                .encode(Charset.forName("UTF-8"))
                .build()
                .toUri();

        log.info("URI: {}", uri);

        RestTemplate restTemplate = new RestTemplate();

        RequestEntity<Void> req = RequestEntity
                .get(uri)
                .header("X-Naver-Client-Id", "")
                .header("X-Naver-Client-Secret", "")
                .build();


        ResponseEntity<String> result = restTemplate.exchange(req, String.class);

        return result.getBody();
    }

    @GetMapping("/hello")
//    public String hello() {
    public User hello(@RequestParam String name, @RequestParam int age) {

        User user = new User();

//        user.setName("slykid");
//        user.setAge(30);

        user.setName(name);
        user.setAge(age);

//        return "hello server!";
        return user;
    }

    @PostMapping("/user/{userId}/name/{userName}")
    public User post(@RequestBody User user, @PathVariable int userId, @PathVariable String userName) {
        log.info("User ID: {}, User Name: {}", userId, userName);
        log.info("Client Request : {}", user);

        return user;

    }

    @PostMapping("/userexchange/{userId}/name/{userName}")
    public User exchange(
            @RequestBody User user,
            @PathVariable int userId,
            @PathVariable String userName,
            @RequestHeader("x-authorization") String authorization,
            @RequestHeader("custom-header") String customHeader
    ) {
        log.info("User ID: {}, User Name: {}", userId, userName);
        log.info("authorization: {}, custom: {}", authorization, customHeader);
        log.info("Client Request : {}", user);

        return user;

    }

    @PostMapping("/genericexchange/{userId}/name/{userName}")
    public Req<User> genericexchange(
//                         HttpEntity<String> entity,
            @RequestBody Req<User> user,
            @PathVariable int userId,
            @PathVariable String userName,
            @RequestHeader("x-authorization") String authorization,
            @RequestHeader("custom-header") String customHeader
    ) {
//        log.info("req: {}", entity.getBody());  // HTTP Entity 확인용
        log.info("User ID: {}, User Name: {}", userId, userName);
        log.info("authorization: {}, custom: {}", authorization, customHeader);
        log.info("Client Request : {}", user);

        Req<User> response = new Req<>();

        response.setHeader(
                new Req.Header()
        );

        response.setBody(
                user.getBody()
//                null  // HTTP Entity 확인용
        );

        return response;

    }

}
