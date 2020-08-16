package com.jiangjiawei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class WebContainerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebContainerApplication.class, args);
    }

    //    编写一个响应式编程的demo
//    @Bean
//    public RouterFunction<ServerResponse> hello(){
//        return route(GET("/hello"),
//                serverRequest -> ok().body(
//                        Mono.just("hello word"),String.class));
//    }

}
