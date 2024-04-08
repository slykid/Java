package org.example.swagger.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
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

    @GetMapping("/plus/{x}")
    public int plus(
            @PathVariable
            @Schema(description="Path Value", example="20") int x,
            @Parameter(name="y", description="y값 / Query Parameter", example="5")
            @RequestParam int y
    )
    {
        return x + y;
    }

    @GetMapping("/user")
    public UserRes user(UserReq userReq)
    {
        return new UserRes(userReq.getName(), userReq.getAge());
    }

}
