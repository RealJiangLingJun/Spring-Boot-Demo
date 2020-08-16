package com.jiangjiawei;


import com.jiangjiawei.domain.Guest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

public class GuestValidTest {

    public static void main(String[] args) {
        /**校验框架模式之一：普通模式（返回所有不符合规则属性）**/
//        //创建Validator实例
//        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//        //创建一个不符合要求的实例
//        Guest guest = new Guest("","");
//        //验证，接收验证结果
//        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
//        for(ConstraintViolation<Guest> violation: violationSet) {
//            System.out.println(violation.getPropertyPath()+"\t"+ violation.getMessage());
//        }

        /**快速失败模式（有一个不符合校验规则就返回）**/
        //创建Validator实例
        Validator validator = Validation.byDefaultProvider().configure()
                .addProperty("hibernate.validator.fail_fast","true").buildValidatorFactory().getValidator();
        //创建一个不符合要求的实例
        Guest guest = new Guest("","");
        //验证，接收验证结果
        Set<ConstraintViolation<Guest>> violationSet = validator.validate(guest);
        for(ConstraintViolation<Guest> violation: violationSet) {
            System.out.println(violation.getPropertyPath()+"\t"+ violation.getMessage());
        }
    }
}
