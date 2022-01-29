package com.kilhyun.study.hellospringboot.controller;

import com.kilhyun.study.hellospringboot.dto.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
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