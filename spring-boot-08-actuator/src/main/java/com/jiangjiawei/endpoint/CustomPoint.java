package com.jiangjiawei.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Component//这类首先要是spring中的组件
@Endpoint(id = "custom")//设置为自定义的端点
public class CustomPoint {

    @ReadOperation//表示在查看该端点时会找到相应的方法
    @ResponseBody//返回的数据类型为Json格式
    public Map<String,String> custom(){
        Map<String,String> result = new HashMap<>();
        result.put("name","Custom Point");
        return result;
    }
}
