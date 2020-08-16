package com.jiangjiawei.controller;

import com.jiangjiawei.domain.Guest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GuestController {

    /**
     * @Valid 直接放在参数前面，校验参数是否符合规则
     * 校验不通过时  直接返回400  和  失败原因
     * 处理方式是，遍历全部属性(默认)，失败结果全部返回
     * 处理方式也可以自定义快速失败等等。。。 BindingResult
     * @param guest
     * @return
     */
    @PostMapping("/add")
    public String add(@Valid Guest guest, BindingResult result){
        if(result.getErrorCount()>0){
            List<FieldError> fieldErrorList = result.getFieldErrors();
            StringBuffer stringBuffer = new StringBuffer();
            for(FieldError fieldError : fieldErrorList){
                stringBuffer.append(fieldError.getField());
                stringBuffer.append("\t");
                stringBuffer.append(fieldError.getDefaultMessage());
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        }
        return guest.toString();
    }
}
