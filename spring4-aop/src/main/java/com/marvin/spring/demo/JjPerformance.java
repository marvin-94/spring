package com.marvin.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class JjPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("林俊杰开始演唱");
    }

    @Override
    public void sayInfo(String name, int age) {
        System.out.println("我是" + name + ",今年" + age);
    }

    @Override
    public void song(String song) {
        System.out.println("我开始演唱" + song);
    }
}
