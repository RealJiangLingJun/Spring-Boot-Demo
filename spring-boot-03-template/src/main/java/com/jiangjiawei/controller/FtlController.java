package com.jiangjiawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * 注意：@Controller 是视图层使用的注解
 * @RestController 是控制层返回Json数据的注解
 */
@Controller
public class FtlController {

    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("now",new Date().toString());
        return "/freemarker/index";
    }
}
