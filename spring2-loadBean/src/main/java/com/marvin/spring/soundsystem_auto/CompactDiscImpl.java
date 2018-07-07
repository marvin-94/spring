package com.marvin.spring.soundsystem_auto;

import org.springframework.stereotype.Component;

/**
 * 光盘实现类
 */
@Component//告知spring要为这个类创建bean
//@Component("compactDiscImpl")// 创建bean的时候指明bena的名字，默认名字为 class的名字首字母变成小写
public class CompactDiscImpl implements CompactDisc {
    @Override
    public void play() {
        System.out.print("开始播放音乐");
    }
}
