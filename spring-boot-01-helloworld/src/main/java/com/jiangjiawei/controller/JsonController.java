package com.jiangjiawei.controller;

import com.jiangjiawei.config.UserConfig;
import com.jiangjiawei.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个注解用来返回json格式的字符串
 * 是controller和responseBody两注解的合并
 */
@RestController
public class JsonController {

    //使用@Value注解加上${}得到配置文件的配置信息
//    @Value("${jjw.name}")
//    private String name;
//    @Value("${user.sex}")
//    private String sex;
//    @Value("${user.age}")
//    private Integer age;

    @Autowired
    private UserConfig userConfig;

    @RequestMapping("/json")
    public User json(){
        System.out.println("访问到controller/JsonController类的json方法");
//        System.out.println(name);
        User user = new User("jjw","nan",19);
//        user.setName(name);
//        user.setSex(sex);
//        user.setAge(age);
        user.setName(userConfig.getName());
        user.setSex(userConfig.getSex());
        user.setAge(userConfig.getAge());
        return user;
    }
}