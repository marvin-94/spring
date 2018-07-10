package com.marvin.spring.profile;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DatabaseConfig.class})
@ActiveProfiles("dev")//指定测试时所使用的配置环境,运行环境可以配置web.xml的init-param 或 context-param 的spring.profiles.active
public class DatabaseTest {
    @Autowired
    Database database;

    @Rule
    public SystemOutRule sout = new SystemOutRule().enableLog();

    @Test
    public void sayEnvirment() {
        database.sayProfile();
        Assert.assertEquals("我是开发环境", sout.getLog());
    }
}