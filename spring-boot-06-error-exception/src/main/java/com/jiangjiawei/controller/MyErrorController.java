package com.jiangjiawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {

    @RequestMapping("/error404")
    public String error404(){
        return "error404";
    }

    @RequestMapping("/throwsError")
    public String error() throws NullPointerException{
        throw new NullPointerException("空指针异常");
    }
}