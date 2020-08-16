package com.jiangjiawei.customizer;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class MyCustomizer {
    //使用WebServerFactoryCustomizer来注册bean，通过更改错误码的处理路径，来指定不同的页面

    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage = new ErrorPage(HttpStatus.NOT_FOUND,"/error404");
                factory.addErrorPages(errorPage);
            }
        };
    }
}
