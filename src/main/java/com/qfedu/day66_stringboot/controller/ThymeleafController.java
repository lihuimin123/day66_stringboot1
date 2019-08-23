package com.qfedu.day66_stringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(Model model, HttpServletRequest request, HttpSession session){

          model.addAttribute("info","hahhaha");
          model.addAttribute("birth",new Date());
          request.setAttribute("name","shangsan");
          session.setAttribute("age",30);

        Map<String,Object> map = new HashMap<>();
        map.put("name","lisi");
        map.put("age","20");
        map.put("qq","1234567");
        model.addAttribute("user",map);
        //返回的是跳转到的资源，本例中，表示跳转到templates目录下的index.html
        return "index";

    }}