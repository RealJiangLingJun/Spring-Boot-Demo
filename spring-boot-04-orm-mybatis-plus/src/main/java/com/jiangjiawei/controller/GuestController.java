package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.service.imple.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制类
 */
@Controller
@RequestMapping("/guest")//表示类中的每个方法请求都是这个开头
public class GuestController {

    @Autowired
    private GuestService guestService;

    //显示所有的嘉宾列表
//    @RequestMapping(method = RequestMethod.GET) == @GetMapping
    @GetMapping
    public String list(Model model){
        model.addAttribute("guestList",guestService.list());
        System.out.println(guestService.list());
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @Transactional
    @PostMapping("")
    public String add(Guest guest){
        guest.setId(null);
        System.out.println(guest.toString());
        guestService.save(guest);
//        int a = 1/0; //测试事务
        return "redirect:/guest";
    }



}
