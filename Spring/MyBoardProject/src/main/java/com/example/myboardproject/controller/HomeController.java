/**
 * packageName  : com.example.myboardproject.controller
 * fileName     : HomeController
 * author       : kilhyunkim
 * date         : 25. 2. 4.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 25. 2. 4.          kilhyunkim         최초작성
 */
package com.example.myboardproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}
