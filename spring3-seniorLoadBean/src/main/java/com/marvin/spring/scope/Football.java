package com.marvin.spring.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)//声明作用域为‘单例’
public class Football {
    public void play() {
        System.out.print("踢足球");
    }
}
