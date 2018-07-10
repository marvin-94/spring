package com.marvin.spring.various;

import org.springframework.stereotype.Component;

@Component
@Cold
public class IceCream implements Dessert {
    @Override
    public void say() {
        System.out.print("我是冰淇淋");
    }
}
