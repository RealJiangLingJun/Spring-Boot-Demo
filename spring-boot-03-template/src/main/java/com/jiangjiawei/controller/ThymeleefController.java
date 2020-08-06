package com.jiangjiawei.controller;

import com.jiangjiawei.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleefController {

    @RequestMapping("/thyme")
    public String index(Model model){
        model.addAttribute("name", "Thymeleaf");
        model.addAttribute("uname", "<br>UThymeleaf<br>");
        User user = new User("jjw","nan",19);
        model.addAttribute("user",user);
        return "/thymeleef/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "/thymeleef/welcome";
    }
}
