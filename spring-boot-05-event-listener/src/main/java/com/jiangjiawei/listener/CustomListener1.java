package com.jiangjiawei.listener;

import com.jiangjiawei.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 实现监听器的第一种方式：实现spring提供的ApplicationListener接口
 */
public class CustomListener1 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener1已监听到");
    }
}
