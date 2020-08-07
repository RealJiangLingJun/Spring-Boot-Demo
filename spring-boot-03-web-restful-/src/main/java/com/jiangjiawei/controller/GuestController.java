package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.service.imple.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    //显示添加嘉宾页面
//    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    //添加嘉宾，并回到嘉宾列表
    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";
    }

    //去更新嘉宾信息

    /**
     * @PathVariable("name") 表示从路径中获取name的值
     * @param name
     * @param model
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name, Model model){
        model.addAttribute("guest",guestService.selectByName(name));
        return "update";
    }

    //修改嘉宾信息，并回到嘉宾列表
    @PutMapping
    public String update(Guest guest){
        guestService.update(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";
    }
}
