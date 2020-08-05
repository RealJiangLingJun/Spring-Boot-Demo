package jiangjiawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 声明是一个控制层类
 */
@Controller
public class HelloController {

    /**
     * @RequestMapping("/hello")
     * 用来在方法和请求之间产生映射关系
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("访问到controller/helloController类的hello方法");
        return "HelloWorld";
    }
}