package com.marvin.spring.various;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class EatServiceTest {

    @Autowired
    private EatService service;

    @Autowired
    private EatService service2;


    @Rule
    public SystemOutRule rule = new SystemOutRule().enableLog();

    @Test
    public void saytest(){
        service.say();
        service2.say();
       // Assert.assertEquals("我是冰淇淋",rule.getLog());
    }
}
