package com.jiangjiawei.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {
    @Override
    public Health health(){
        int errorCode = 1;
        //返回不健康指标
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        //返回一个健康指标
        return Health.up().build();
    }
}
