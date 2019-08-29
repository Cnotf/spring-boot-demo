package com.xkcoding.orm.mybatis.service;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:28 2019/08/28
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface PayNote {

    String value() default "";
}
