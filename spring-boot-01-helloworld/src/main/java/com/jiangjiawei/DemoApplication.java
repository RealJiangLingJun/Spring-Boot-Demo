package com.jiangjiawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用注解@SpringBootApplication
 * 声明该类是程序入口类
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        //可以使用SpringApplication类的静态方法 来启动程序
        //传入参数 ： 程序的入口类     main函数的参数
        SpringApplication.run(DemoApplication.class,args);

    }
}
