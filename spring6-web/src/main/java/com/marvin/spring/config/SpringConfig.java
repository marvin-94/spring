package com.marvin.spring.config;

import com.marvin.spring.service.ServiceScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {ServiceScan.class})
public class SpringConfig {
}
