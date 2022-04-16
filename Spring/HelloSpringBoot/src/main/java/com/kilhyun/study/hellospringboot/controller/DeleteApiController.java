package com.kilhyun.study.hellospringboot.controller;

import org.springframework.web.bind.annotation.*;

/*
    DELETE Method 는 리소스를 삭제하는 메소드이므로
    리소스가 없다고 해서 에러코드를 반환하는 것이 아니라,
    정상적으로 수행됬다는 200 메소드를 반환하게 된다.
*/

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account)
    {
        System.out.println("Delete User " + account + " (" + userId + ")");
    }

}
