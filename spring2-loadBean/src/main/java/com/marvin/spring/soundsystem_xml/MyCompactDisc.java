package com.marvin.spring.soundsystem_xml;

public class MyCompactDisc implements CompactDisc {
    private String singer;
    private String songName;

    public MyCompactDisc() {
    }

    public MyCompactDisc(String songName, String singer) {
        this.singer = singer;
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.print(singer + "开始唱" + songName);
    }
}
