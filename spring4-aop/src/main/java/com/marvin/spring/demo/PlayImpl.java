package com.marvin.spring.demo;

import org.springframework.stereotype.Component;

/**
 * 增强的接口实现类
 */
@Component
public class PlayImpl implements Play {
    @Override
    public void play() {
        System.out.println("玩一会游戏");
    }
}
