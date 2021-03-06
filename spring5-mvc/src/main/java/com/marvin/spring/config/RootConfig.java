package com.marvin.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * spring容器配置文件
 */
@Configuration
//Controller已经在mvc中注册，此处不需要重复注册，
@ComponentScan(basePackages = {"com.marvin.spring"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})})
public class RootConfig {
}
