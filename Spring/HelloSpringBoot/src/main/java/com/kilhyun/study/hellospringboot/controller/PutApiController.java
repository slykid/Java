package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
PUT API
- 사용자로부터 요청받은 내용이 없으면, 새로 생성하고, 기존에 있는 객체라면 업데이트를 수행한다.
- 예시
{
    "name": "slykid",
    "age": 30,
    "car_list": [
        {
            "name": "BMW",
            "car_number": "11가 1234"
        },
        {
            "name": "K7",
            "car_number": "22나 5678"
        },
        ...
    ]
}
*/

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto) {
        System.out.println(requestDto);

        return requestDto;
    }

}