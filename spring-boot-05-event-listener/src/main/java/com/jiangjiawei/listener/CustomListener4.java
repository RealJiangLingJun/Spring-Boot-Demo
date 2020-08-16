package com.jiangjiawei.listener;

import com.jiangjiawei.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 实现监听器的第四种方式：
 * 实现spring提供的ApplicationListener接口，和第一种方式相似
 * 但并不是通过获取启动后的容器来加载的
 * 而是通过配置的方法是来加载
 *
 * context:
 *   listener:
 *     classes: 类路径
 */
public class CustomListener4 implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener4已监听到");
    }
}
