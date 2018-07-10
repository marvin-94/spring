package com.marvin.spring.profile;

public class VirDatabase implements Database {
    @Override
    public void sayProfile() {
        System.out.print("我是正式环境");
    }
}
