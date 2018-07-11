package com.marvin.spring.config;

import com.marvin.spring.web.WebScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * dispatcherServlet 配置类
 * 主要配置web相关的bean，例如：视图解析器、静态资源处理、开启扫描控制器、开启注解驱动
 */
@Configuration
@EnableWebMvc//开启注解驱动的mvc
@ComponentScan(basePackageClasses = {WebScan.class})
//继承WebMvcConfigurerAdapter是为了处理静态资源不被dispatcherServlet处理
public class WebAppConfig extends WebMvcConfigurerAdapter {
    //注册视图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }

    //设置静态资源不被前端控制器处理
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
