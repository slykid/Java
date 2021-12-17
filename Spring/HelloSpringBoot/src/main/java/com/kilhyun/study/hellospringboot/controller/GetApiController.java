package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello")   // http://localhost:9090/api/get/hello
    public String getHello() {
        return "Get Hello!";
    }

    @RequestMapping(path = "/hi", method= RequestMethod.GET)   // http://localhost:9090/api/get/hi
    public String getHi() {
        return "Get Hi!";
    }

    // path variable
    @GetMapping("/path-variable/{name}")  // http://localhost:9090/api/get/path-variable/{name}
    public String pathVariable(@PathVariable(name = "name") String pathName) {
        // @PathVariable 어노테이션으로 주소상의 변수값을 지정할 수 있음
        // - 형식: @PathVariable 데이터타입 변수
        // "@PathVariable(name=값) 데이터타입 변수" 를 사용해서 만약 변수명을 다르게 설정할 수 있음

        System.out.println("Path Variable: " + pathName);

        return "Get Path Variable : " + pathName;
    }

    // Query Parameter
    // - http://localhost:9090/api/get/query-param?user={계정}&email={이메일주소}&age={나이}
    // ex. http://localhost:9090/api/get/query-param?user=slykid&email=slykid@naver.com&age=29
    @GetMapping("query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
           System.out.println(entry.getKey());
           System.out.println(entry.getValue());
           System.out.print("\n");

           sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    // @RequestParam 어노테이션을 각 매개변수마다 지정해줌으로써, 입력할 매개변수의 개수와 데이터타입, 값을 지정해줄 수 있다.
    // - 만약 클라이언트가 위의 형식에 잘못된 값을 입력하는 경우에는 400 번대 에러가 발생함
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    // 위의 방식대로면, 변수 개수가 많을 경우 코드가 난잡해짐 -> 스프링에서는 이를 DTO 형태로 매핑해서 사용함(UserRequest 참고)
    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest) {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }


}
