package com.marvin.spring.soundsystem_java;

/**
 * 播放器实现类
 */
public class CDPlayer implements MediaPlayer {
    private CompactDisc disc;

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
