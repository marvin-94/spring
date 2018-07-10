package com.marvin.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)//声明作用域为‘原型’
public class Basketball {
    public void play() {
        System.out.print("打篮球");
    }
}
