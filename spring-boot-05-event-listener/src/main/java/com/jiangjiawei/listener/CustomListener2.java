package com.jiangjiawei.listener;

import com.jiangjiawei.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 实现监听器的第二种方式：实现spring提供的ApplicationListener接口
 * 但是不从主程序入口加载监听，直接使用注解
 * @Component 注解这是需要注解的监听器
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener2已监听到");
    }
}
