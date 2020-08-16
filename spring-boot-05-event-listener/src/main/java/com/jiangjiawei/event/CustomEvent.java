package com.jiangjiawei.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    //构造器 source表示最初发生事件的对象
    public CustomEvent(Object source) {
        super(source);
    }

    public void printMessage(String message){
        System.out.println("自定义事件:"+message+".发生事件的对象是："+this.source);
    }

}
