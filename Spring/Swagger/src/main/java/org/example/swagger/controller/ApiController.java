package org.example.swagger.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
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
            @Parameter(name="x값", description="x 값", example="20")
            @PathVariable int x,
            @Parameter(name="y값", description="y 값", example="5")
            @RequestParam int y
    )
    {
        return x + y;
    }

}
