package com.marvin.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * spring容器配置文件
 */
@Configuration
//webAppConfig 已经被其他地方加载，此处不需要扫描它
@ComponentScan(basePackages = {"com.marvin.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
