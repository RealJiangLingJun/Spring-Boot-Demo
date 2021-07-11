package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import com.jiangjiawei.service.imple.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 视图控制类
 */
@RestController
@RequestMapping("/guest")//表示类中的每个方法请求都是这个开头
public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping()
    public List<Guest> list(){
        return guestService.list();
    }

    @GetMapping("/{id}")
    public Guest getGuestById(@PathVariable(name = "id") int id){
        return guestService.getGuestById(id);
    }

    //测试更新缓存
    @GetMapping("/update")
    public Guest updateGuest(Guest guest){
        return guestService.updateGuest(guest);
    }

    //测试删除缓存
    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable(name = "id") int id){
        guestService.deleteGuest(id);
        return "success";
    }
    @GetMapping("/delete")
    public String deleteAll(){
        guestService.deleteAll();
        return "success deleteAll";
    }

}
