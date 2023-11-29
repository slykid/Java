package com.example.client.service;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.ParameterizedType;
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

    public Req<UserResponse> genericExchange() {
        // http://localhost:9090/api/server/genericexchange/{userId}/name/{userName}
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/genericexchange/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "slykid")
                .toUri();

        System.out.println("URI : " + uri);

        // http body -> object -> object mapper -> json -> rest template -> http
        UserRequest userRequest = new UserRequest();
        userRequest.setName("slykid");
        userRequest.setAge(30);

        Req<UserRequest> req = new Req<UserRequest>();
        req.setHeader(
                new Req.Header()
        );

        req.setBody(
                userRequest
        );

        RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();

        // Parameterized Type Reference
        // - exchange 메소드 특성 상 요청할 객체와 반환할 클래스를 매개변수로 넣어줘야하나,
        //   제네릭은 클래스로 사용할 수 없기 때문에 이를 대응하기 위한 수단임
        ResponseEntity<Req<UserResponse>> response =
                restTemplate.exchange(requestEntity, new ParameterizedTypeReference<Req<UserResponse>>() {
                });

//        return response.getBody().getBody();  // 첫번째 getBody는 반환 값이 제네릭 타입이며, 우리가 실질적으로 반환해줄 값은 그 안의 Body 에 존재함
        return response.getBody();
    }

}
