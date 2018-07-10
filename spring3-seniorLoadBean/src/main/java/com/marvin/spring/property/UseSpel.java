package com.marvin.spring.property;

public class UseSpel {
    private String name;
    private Integer age;

    public UseSpel(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println("我是" + name + ",我" + age + "岁");
    }
}
