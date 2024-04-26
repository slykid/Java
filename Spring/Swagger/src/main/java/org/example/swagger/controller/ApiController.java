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
//            @PathVariable
//            @Schema(description="Path Value", example="20") int x,
//            @Parameter(name="y", description="y값 / Query Parameter", example="5")
//            @RequestParam int y
//    )
//    {
//        return x + y;
//    }

    @Parameters({
        @Parameter(name="x", description="x 값"),
        @Parameter(name="y", description="y 값")
    })
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x, @RequestParam int y)
    {
        return x + y;
    }

    @ApiResponse(responseCode="600", description="사용자의 나이가 10살 이하일 때")
    @Operation(summary="사용자의 이름과 나이를 리턴하는 메소드")
    @GetMapping("/user")
    public UserRes user(UserReq userReq)
    {
        return new UserRes(userReq.getName(), userReq.getAge());
    }

}
