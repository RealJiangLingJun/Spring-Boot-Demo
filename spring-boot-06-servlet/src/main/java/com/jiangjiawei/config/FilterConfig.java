package com.jiangjiawei.config;

import com.jiangjiawei.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    //将自定义的Filter注入到容器中
    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean(){
        //创建Filter注册器对象
        FilterRegistrationBean<CustomFilter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        //想注册器对象中添加自定义注册器
        filterFilterRegistrationBean.setFilter(new CustomFilter());
        //设置过滤器的过滤条件
        filterFilterRegistrationBean.addUrlPatterns("/*");
        //设置注册器的过滤优先级
//        filterFilterRegistrationBean.setOrder(0);
        //返回Filter注册器对象
        return filterFilterRegistrationBean;
    }
}
