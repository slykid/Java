package org.example.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.swagger.dto.UserReq;
import org.example.swagger.dto.UserRes;
import org.springframework.web.bind.annotation.*;

@Tag(name="테스트", description="API 정보를 제공하는 Controller")
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Swagger!";
    }

//    @GetMapping("/plus/{x}")
//    public int plus(
              // Path Variable 로 선언하는 경우
//            @PathVariable
//            @Schema(description="Path Value", example="20") int x,  // @Schema: @PathVariable 로 선언된 변수에 대한 설명

              // Request Parameter 로 선언하는 경우
//            @Parameter(name="y", description="y값 / Query Parameter", example="5")
//            @RequestParam int y
//    )
//    {
//        return x + y;
//    }

    // @Parameters: 여러 변수에 대한 설명을 한꺼번에 받을 경우에 사용
    // - 메소드의 매개변수 순서대로 설명이 매핑됨
    @Parameters({
        @Parameter(name="x", description="x 값"),  // @Parameter: 각 매개변수에 대한 설명을 추가할 때 사용
        @Parameter(name="y", description="y 값")
    })
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x, @RequestParam int y)
    {
        return x + y;
    }

    @ApiResponse(responseCode="600", description="사용자의 나이가 10살 이하일 때")  // @ApiResponse: API 응답 시, 반환할 코드에 대한 정의를 기술할 때 사용
    @Operation(summary="사용자의 이름과 나이를 리턴하는 메소드")  // @Operation: 메소드에 대한 설명을 기술할 때 사용
    @GetMapping("/user")
    public UserRes user(UserReq userReq)
    {
        return new UserRes(userReq.getName(), userReq.getAge());
    }

}
