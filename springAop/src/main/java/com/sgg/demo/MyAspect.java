package com.sgg.demo;

public class MyAspect {
    public void before(){
        System.out.println("aspect before");
    }

    public void afterReturning(){
        System.out.println("aspect afterReturning");
    }

    public void afteThrowing(){
        System.out.println("aspect afteThrowing");
    }
    public void after(){
        System.out.println("aspect after(finally)");
    }
}
