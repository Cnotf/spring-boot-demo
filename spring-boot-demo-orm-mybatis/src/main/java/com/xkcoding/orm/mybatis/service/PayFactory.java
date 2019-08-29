package com.xkcoding.orm.mybatis.service;

import org.reflections.Reflections;

import java.util.*;

import static java.util.stream.Collectors.toMap;

/**
 * @Author: cnotf
 * @Description:
 * @Date: Create in 23:30 2019/08/28
 */
public class PayFactory {

    private static PayFactory payFactory = new PayFactory();
    private static Map<String, Class<?>> payMap = new HashMap<>();


    private PayFactory(){

    }

    static {
        Reflections reflections = new Reflections("com.xkcoding.orm.mybatis.service.impl");
        Set<Class<?>> classSet = reflections.getTypesAnnotatedWith(PayNote.class);
        payMap = classSet.stream().collect(toMap(t -> t.getAnnotation(PayNote.class).value(), t -> (Class) t));
    }

    public Pay createPay(String payId) throws Exception{
        Class<?> aClass = payMap.get(payId);
        return (Pay) aClass.newInstance();
    }

    public static PayFactory newInstance(){
        return payFactory;
    }
}
