package com.marvin.spring.profile;

public class QaDatabase implements Database {
    @Override
    public void sayProfile() {
        System.out.print("我是测试环境");
    }
}
