package com.example.client.service;

import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

    // http://localhost:9090/api/server/hello
    /*
        [GET 방식의 REST API Template 을 사용하는 경우]
        * 어떤 서버가 특정 데이터를 준다고 가정했을 때, 주어지는 JSON 표준 규격을 보고, DTO 클래스를 생성한다.
        * DTO를 생성한 후, REST Template 을 활용해서, GET 방식의 형태로 기능을 구현한다.
        * GET 의 경우에는 입력으로 넘어오는 주소만 전달하면 되기 때문에, 별다른 문제가 없다.

    */

//    public String hello() {
    public UserResponse hello(String name, int age) {
        // URIBuilder 에는 URL 뿐만 아니라 QueryParam 등도 지원해준다.
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/hello")
                .queryParam("name", name)
                .queryParam("age", age)
                .encode()
                .build()
                .toUri();

        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();

//         String result = restTemplate.getForObject(uri, String.class);
//        ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());

//         return result;
        return result.getBody();
    }

    public UserResponse post() {

        // http://localhost:9090/api/server/user/{userId}/name/{userName}
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "slykid")
                .toUri();

        System.out.println("URI : " + uri);

        // http body -> object -> object mapper -> json -> rest template -> http
        UserRequest req = new UserRequest();
        req.setName("slykid");
        req.setAge(30);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, req, UserResponse.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

        return response.getBody();
    }

    public UserResponse exchange() {
        // http://localhost:9090/api/server/userexchange/{userId}/name/{userName}
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/userexchange/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "slykid")
                .toUri();

        System.out.println("URI : " + uri);

        // http body -> object -> object mapper -> json -> rest template -> http
        UserRequest req = new UserRequest();
        req.setName("slykid");
        req.setAge(30);

        RequestEntity<UserRequest> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity, UserResponse.class);

        return response.getBody();
    }

}
