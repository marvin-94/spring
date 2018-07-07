package com.marvin.spring.soundsystem_auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 播放器实现类
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc disc;

    @Autowired//自动注入，可以使用在set方法上 也可以使用在构造器方法上
    //@Autowired(required = false)//如果没有可以注入的bean，false代表不报错,如果有多个可以注入的bean，spring会报错，不知道选哪一个
    public CDPlayer(CompactDisc disc) {
        this.disc = disc;
    }

    public CDPlayer() {
    }

    @Override
    public void play() {
        disc.play();
    }
}
