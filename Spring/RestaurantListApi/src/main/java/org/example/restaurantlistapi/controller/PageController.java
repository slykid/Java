package org.example.restaurantlistapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/pages")
public class PageController {

    @GetMapping("/main")
    public ModelAndView main() {
        return new ModelAndView("main");
    }
}
