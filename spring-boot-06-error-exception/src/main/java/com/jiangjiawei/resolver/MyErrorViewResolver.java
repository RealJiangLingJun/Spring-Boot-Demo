package com.jiangjiawei.resolver;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component//需要是一个bean  能够被spring容器处理  才会生效
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        if(status.equals(HttpStatus.NOT_FOUND)){
            ModelAndView mv = new ModelAndView();
            mv.setViewName("/resolver404");
            return mv;
        }
        return null;
    }
}
