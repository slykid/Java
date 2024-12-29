/**
 * packageName  : com.example.hellospring.controller
 * fileName     : HelloController
 * author       : kilhyunkim
 * date         : 24. 12. 29.
 * description
 * ===================================================
 * DATE                 AUTHOR              NOTE
 * ---------------------------------------------------
 * 24. 12. 29.          kilhyunkim         최초작성
 *
*/
package com.example.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");

        return "hello";
    }

}
