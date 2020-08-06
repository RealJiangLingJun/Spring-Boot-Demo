package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.service.imple.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图控制类
 */
@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    //显示所有的嘉宾列表
    @RequestMapping("/guest/list")
    public String list(Model model){
        model.addAttribute("guestList",guestService.list());
        System.out.println(guestService.list());
        return "list";
    }

    //显示添加嘉宾页面
    @RequestMapping("/guest/toAdd")
    public String toAdd(){
        return "add";
    }

    //添加嘉宾，并回到嘉宾列表
    @RequestMapping("/guest/add")
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest/list";
    }

    //去更新嘉宾信息
    @RequestMapping("/guest/toUpdate")
    public String toUpdate(String name,Model model){
        model.addAttribute("guest",guestService.selectByName(name));
        return "update";
    }

    //修改嘉宾信息，并回到嘉宾列表
    @RequestMapping("/guest/update")
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest/list";
    }

    @RequestMapping("/guest/delete")
    public String delect(String name){
        guestService.delete(name);
        return "redirect:/guest/list";
    }
}
