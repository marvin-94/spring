package com.marvin.spring.soundsystem_xml;

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

    public void setDisc(CompactDisc disc) {
        this.disc = disc;
    }

    @Override
    public void play() {
        disc.play();
    }
}
