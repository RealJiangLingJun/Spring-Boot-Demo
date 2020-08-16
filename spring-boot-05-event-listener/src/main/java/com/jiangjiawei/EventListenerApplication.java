package com.jiangjiawei;

import com.jiangjiawei.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
        //第一种方法：通过获取启动后的容器，加载自定义的监听器
        ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
        context.addApplicationListener(new CustomListener1());
    }

}
