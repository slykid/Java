/**
 * packageName  : com.example.hellospring.controller
 * fileName     : HomeController
 * author       : kilhyunkim
 * date         : 25. 1. 18.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 1. 18.          kilhyunkim         최초작성
 */
package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
