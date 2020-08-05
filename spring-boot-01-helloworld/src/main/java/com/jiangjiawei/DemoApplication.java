package com.jiangjiawei;

import com.jiangjiawei.config.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 使用注解@SpringBootApplication
 * 声明该类是程序入口类
 *
 * @EnableAutoConfiguration
 * 告诉主程序 要自动引入配置文件，配置文件对应的类作为他的参数
 */
@SpringBootApplication
@EnableConfigurationProperties({UserConfig.class})
public class DemoApplication {

    public static void main(String[] args) {
        //可以使用SpringApplication类的静态方法 来启动程序
        //传入参数 ： 程序的入口类     main函数的参数
        SpringApplication.run(DemoApplication.class,args);

    }
}
