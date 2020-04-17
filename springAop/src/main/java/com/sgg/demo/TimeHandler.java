package com.sgg.demo;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class TimeHandler implements MethodBeforeAdvice, AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("代理----后----CurrentTime = " + System.currentTimeMillis());
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("代理----前----CurrentTime = " + System.currentTimeMillis());
    }
}
