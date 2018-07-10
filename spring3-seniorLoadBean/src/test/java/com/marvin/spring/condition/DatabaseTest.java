package com.marvin.spring.condition;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class})
public class DatabaseTest {
    @Rule
    public SystemOutRule sout = new SystemOutRule().enableLog();
    @Autowired
    DataService dataService;

    @Test
    public void sayEnvirment() {
        dataService.say();
        Assert.assertEquals("我是正式环境", sout.getLog());
    }
}