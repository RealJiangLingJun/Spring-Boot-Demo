package com.jiangjiawei.listener;

import com.jiangjiawei.event.CustomEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 实现监听器的第三种方法：不需要实现ApplicationListener接口
 * 使用@Component注解  当前类是Component组件bean，需要被加载
 * 使用@EventListener 注解这是一个监听组件，监听的事件是方法的参数,标注这是监听器bean
 */
@Component
public class CustomListener3 {

    @EventListener
    public void eventListener(CustomEvent customEvent){
        customEvent.printMessage("CustomListener3已监听到");
    }
}
