package com.marvin.spring.soundsystem_java;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这个是javaconfig显示配置类
public class CDPlayerConfig {

    @Bean //将该方法返回的对象 注册为bean
    //@Bean(name = "compactDiscImpl")//注册bean，同时指定名字，默认名字为 方法名
    public CompactDisc compactDiscImpl() {
        return new CompactDiscImpl();
    }

    /**
     * 一、调用方法注入，@bean的方法所有调用都会被spring拦截，不会每次产生一个新的实例，
     * 容易使人迷惑，建议使用方法二
     */
    @Bean
    public MediaPlayer cDPlayer() {
        return new CDPlayer(compactDiscImpl());
    }

    /**
     * 二、参数注入
     */
//    @Bean
//    public MediaPlayer otherPlayer(CompactDisc compactDisc){
//        return new CDPlayer(compactDisc);
//    }

}
