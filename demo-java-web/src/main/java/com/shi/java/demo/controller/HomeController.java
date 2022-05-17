package com.shi.java.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("home")
public class HomeController {
    @RequestMapping(value = "/index")
    public @ResponseBody String index(){
        return "hello";
    }
}
