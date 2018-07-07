package com.marvin.spring.soundsystem_mix;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//测试开始时自动创建spring的应用上下文
@ContextConfiguration(classes = ApplicationConfig.class)//指明要加载的配置文件
public class CDPlayerTest {
    @Autowired
    MediaPlayer player;

    @Test
    public void beginplay() {
        player.play();
    }

}
