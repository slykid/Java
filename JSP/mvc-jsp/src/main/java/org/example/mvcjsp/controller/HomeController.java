package org.example.mvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class HomeController
{

    @GetMapping("/home")
    public String home()
    {
        System.out.println("TestController home");
        return "home";
    }

    @GetMapping("/test")
    public String test()
    {
        System.out.println("TestController test");
        return "test";
    }
}
