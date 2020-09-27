package com.myfilter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home () {
            return "/home";
    }


    @GetMapping(value = "/login")
    public String login () {
        return "/login";
    }


    @PostMapping(value = "/login")
    public String loginPost () {
        return "redirect:/";
    }


}
