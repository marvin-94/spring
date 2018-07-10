package com.marvin.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class JjPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("林俊杰开始演唱");
    }
}
