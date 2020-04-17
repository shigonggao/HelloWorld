package com.sgg.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("conf/spring-aop-schema-advice.xml");
        AspectBiz aspectBiz = (AspectBiz) ac.getBean("aspectBiz");
        SggBiz sggBiz = (SggBiz) ac.getBean("sggBiz");
        aspectBiz.biz();
        sggBiz.print();
    }
}
