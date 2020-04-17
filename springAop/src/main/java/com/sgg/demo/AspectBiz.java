package com.sgg.demo;

public class AspectBiz {
    public void biz() {
        System.out.println("Aspect biz");
        throw new RuntimeException();
    }
}
