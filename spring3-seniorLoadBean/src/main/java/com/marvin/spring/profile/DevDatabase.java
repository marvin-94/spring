package com.marvin.spring.profile;

public class DevDatabase implements Database {
    @Override
    public void sayProfile() {
        System.out.print("我是开发环境");
    }
}
