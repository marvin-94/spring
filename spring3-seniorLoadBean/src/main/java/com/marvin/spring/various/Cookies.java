package com.marvin.spring.various;

import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {
    @Override
    public void say() {
        System.out.print("我是小甜饼");
    }
}
