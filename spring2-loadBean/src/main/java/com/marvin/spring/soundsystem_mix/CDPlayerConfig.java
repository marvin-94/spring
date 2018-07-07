package com.marvin.spring.soundsystem_mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这个是javaconfig显示配置类
public class CDPlayerConfig {

    @Bean
    public MediaPlayer cDPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
