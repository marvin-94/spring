package com.marvin.spring.soundsystem_auto;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//声明这个是javaconfig显示配置类
@ComponentScan//启动扫描，会自动扫描该注解所在的包，默认是不开启扫描的
//@ComponentScan("com.marvin.spring.soundsystem_auto")//扫描指定的包，string类型不安全
//@ComponentScan(basePackages = {"com.marvin.spring.soundsystem_auto","com.marvin"})//指明多个要扫描的包，string类型不安全
//@ComponentScan(basePackageClasses = {CDPlayerConfig.class,CompactDisc.class})//指明多个要扫描的包，class类型安全
public class CDPlayerConfig {

}
