package com.marvin.spring.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackageClasses = PerformConfig.class)
@EnableAspectJAutoProxy//开启aspect自动代理，不开启编写的切面无效
public class PerformConfig {
    @Bean
    public Audience audience() {
        return new Audience();
    }
}
