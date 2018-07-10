package com.marvin.spring.condition;

public class VirDatabase implements Database {
    @Override
    public void sayProfile() {
        System.out.print("我是正式环境");
    }
}
