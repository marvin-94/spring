package com.marvin.spring.soundsystem_xml;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//测试开始时自动创建spring的应用上下文
@ContextConfiguration(locations = "/applicationContext.xml")//指明要加载的配置文件
public class CDPlayerTest {
    @Autowired
    CompactDisc disc;

    @Autowired
    MediaPlayer player;

    @Rule//控制台输出相关的需要配置
    public  SystemOutRule sout = new SystemOutRule().enableLog();

    @Test//标志要测试的方法
    public void discShouldNotNull() {
        Assert.assertNotNull(disc);
    }

    @Test
    public void beginplay() {
        player.play();
        Assert.assertEquals("qilixiang开始唱zhoujielun", sout.getLog());
    }

}
