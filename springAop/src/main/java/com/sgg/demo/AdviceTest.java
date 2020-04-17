package com.sgg.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Date;

public class AdviceTest implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("方法开始执行"+new Date());
        methodInvocation.proceed();
        System.out.println("方法执行完毕"+new Date());
        return null;
    }
}
