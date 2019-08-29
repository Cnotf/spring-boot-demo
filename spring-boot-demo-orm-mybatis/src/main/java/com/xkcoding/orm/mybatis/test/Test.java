package com.xkcoding.orm.mybatis.test;


import com.xkcoding.orm.mybatis.service.PayNote;
import org.reflections.Reflections;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 17:48 2019/08/28
 */
public class Test {

    public static void main(String[] args) {
        Reflections reflections = new Reflections("com.xkcoding.orm.mybatis.service.impl");
        Set<Class<?>> classSet = reflections.getTypesAnnotatedWith(PayNote.class);
        Map<String, Class<?>> collect = classSet.stream().collect(toMap(t -> t.getAnnotation(PayNote.class).value(), t -> (Class) t));
        System.out.println(collect.toString());

    }
}
