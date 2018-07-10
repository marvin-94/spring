package com.marvin.spring.various;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EatService {
    private Dessert dessert;
    private int i=0;

    public void say() {
        dessert.say();
        System.out.println(i);
        i++;
    }

    @Autowired
    //@Qualifier("cake")//限定id为cake的类可以注入，默认bean的名字为类名字，如果类改名了，会注入报错
    //@Qualifier("myCake")//限定在类上指明的名字，如果存在重复，spring也找不到，因为不允许存在多个Qualifier,可以使用自定义注解
    @Cold//使用自定义注解，class上也要标注
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void say2() {
        System.out.println(i);
    }
}
