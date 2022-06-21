package com.example.springbootexceptions.controller;

import com.example.springbootexceptions.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class RestApiController {

    @GetMapping("")
    // required = false 설정은 요청 파라미터값이 NULL 인 상태를 만들기 위해서 일부러 설정한 옵션임(해당 파라미터 없이도 실행 가능함)
    public User get(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        // 예외발생(NullPointException 발생) -> request 전송 시, 500 에러 반환함
        int a = 10 * age;

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        System.out.println(user);

        return user;
    }

    // 방법 3. 해당 컨트롤러에 추가하기
    // - GlobalControllerAdvice 로 잡혀있더라도 우선 순위는 실행된 컨트롤러 내의 ExceptionHandler 가 더 높다.
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity MethodArgumentNotValidException(MethodArgumentNotValidException e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

}
