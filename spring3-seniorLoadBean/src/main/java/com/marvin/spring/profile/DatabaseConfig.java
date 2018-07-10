package com.marvin.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@Profile("dev")代表开发环境加载该类的所有bean
public class DatabaseConfig {

    @Bean
    @Profile("dev")//指明开发环境使用
    public Database database() {
        return new DevDatabase();
    }

    @Bean
    @Profile("qa")//指明测试环境使用
    public Database qaDatabase() {
        return new QaDatabase();
    }

    @Bean
    @Profile("vir")//指明正式环境使用
    public Database virDatabase() {
        return new VirDatabase();
    }
}
