package com.jiangjiawei.controller;

import com.jiangjiawei.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个controller用来出发监听器
 */
@RestController
public class EventController {

    //自动注入事件发布器
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    public String event(){
        publisher.publishEvent(new CustomEvent(this));
        return "事件发布成功！";
    }
}
