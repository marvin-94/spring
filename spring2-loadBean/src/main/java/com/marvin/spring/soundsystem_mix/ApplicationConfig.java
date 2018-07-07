package com.marvin.spring.soundsystem_mix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)//引用其他配置类文件
@ImportResource("classpath:application.xml")//引用其他xml配置文件
public class ApplicationConfig {
}
