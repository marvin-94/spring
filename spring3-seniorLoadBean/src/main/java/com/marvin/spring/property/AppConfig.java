package com.marvin.spring.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:property.properties")//声明属性源
public class AppConfig {
    //使用environment
    private Environment environment;//注入上下文环境
    //使用value
    @Value("${name}")//使用占位符引用属性值
    private String name;
    @Value("${age}")
    private Integer age;
    //使用spel表达式,todo 有点问题获取不到属性一直为null
    @Value("#{systemProperties['xxx.name']}")
    private String name2;
    @Value("#{systemProperties['xxx.age']}")
    private Integer age2;

    @Autowired
    public AppConfig(Environment environment) {
        this.environment = environment;
    }

    //使用@Value 必须注册此bean,必须是static
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public UseEnvironment useEnvironment() {
        return new UseEnvironment(environment.getProperty("name"), environment.getProperty("age", Integer.class));
    }

    @Bean
    public UseValue useValue() {
        return new UseValue(name, age);
    }

    @Bean
    public UseSpel useSpel() {
        return new UseSpel(name2, age2);
    }
}
