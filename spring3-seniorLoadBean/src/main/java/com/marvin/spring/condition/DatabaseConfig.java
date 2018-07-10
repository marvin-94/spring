package com.marvin.spring.condition;

import com.marvin.spring.profile.Database;
import com.marvin.spring.profile.VirDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    @Conditional(IsVirEnvironment.class)//根据条件类是否满足来决定是否创建该bean
    public Database virDatabase() {
        return new VirDatabase();
    }

    @Bean
    public DataService dataService(Database database) {
        DataService service = new DataService();
        service.setDatabase(database);
        return service;
    }
}
