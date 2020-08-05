package com.jiangjiawei.controller;

import com.jiangjiawei.config.UserConfig;
import com.jiangjiawei.config.VegetablesConfig;
import com.jiangjiawei.domain.User;
import com.jiangjiawei.domain.Vegetables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @Autowired
    private UserConfig userConfig;

    @Autowired
    private VegetablesConfig vegetablesConfig;

    @RequestMapping("/json")
    public User json(){
        System.out.println("访问到controller/JsonController类的json方法");
//        System.out.println(name);
        User user = new User();
//        user.setName(name);
//        user.setSex(sex);
//        user.setAge(age);
        user.setName(userConfig.getName());
        user.setSex(userConfig.getSex());
        user.setAge(userConfig.getAge());
        user.setFriends(userConfig.getFriends());
        return user;
    }


    @RequestMapping("/vegetables")
    @ResponseBody
    public Vegetables getVegetables(){
        Vegetables vegetables = new Vegetables();
        vegetables.setPotato(vegetablesConfig.getPotato());
        vegetables.setEggplant(vegetablesConfig.getEggplant());
        vegetables.setGreenpepper(vegetablesConfig.getGreenpepper());
        return vegetables;
    }


    @RequestMapping("/jasypt")
    @ResponseBody
    public String jasypt(){
        return username+"\t"+password;
    }
}