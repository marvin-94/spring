package com.marvin.spring.various;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackageClasses = {AppConfig.class})
public class AppConfig {

//    @Bean
//    @Primary
//    public Dessert cake(){
//        return new Cake();
//    }
}
