package com.jiangjiawei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServletController {

    @RequestMapping("/servlet")
    public String servlet(){
        System.out.println("ServletController servlet方法");
        return "hello servlet";
    }
}
