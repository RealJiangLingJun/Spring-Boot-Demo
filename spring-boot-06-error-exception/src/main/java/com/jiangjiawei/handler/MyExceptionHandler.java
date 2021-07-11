package com.jiangjiawei.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//作为一个控制层的切面处理，内嵌Component注解
public class MyExceptionHandler {
    //使用@ControllerAdvice注解，只要系统在运行过程中抛出任何异常都可以在这里获取异常信息
    //切面的处理方式  使用@ControllerAdvice注解(spring3.x提供的)

    @ExceptionHandler(Exception.class)
    public ModelAndView handler(Exception e){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",e.getMessage());
        mv.setViewName("/error");
        System.out.println(e.getMessage());
        return mv;
    }
}
