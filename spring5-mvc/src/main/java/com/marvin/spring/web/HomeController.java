package com.marvin.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller //声明这是一个控制器
public class HomeController {

    @RequestMapping(value = {"/","/homepage"}, method = RequestMethod.GET)//指定映射url，请求方式
    public String home() {
        return "home"; //要使用的视图名称
    }

}
