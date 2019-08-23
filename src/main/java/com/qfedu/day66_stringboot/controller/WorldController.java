package com.qfedu.day66_stringboot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController //相当于 @Controller和 @ResponseBody的作用
public class WorldController {
    @GetMapping("/world")
    public String world(){
        return "world";
    }
}
