package com.marvin.spring.various;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary//在产生歧义性时，spring会使用标有primary的实现类,如果有多个primary，spring将无法选择哪一个，推荐使用限定符
@Qualifier("myCake")//显示指明这个类的限定名字
public class Cake implements Dessert {
    @Override
    public void say() {
        System.out.print("我是蛋糕");
    }
}
