package com.marvin.spring.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class AddMethod {
    //value 要加入新接口的接口 +代表本类和他的实现类都可以添加方法，defaultimpl 新街口的实现类
    //引入新功能,使用新添加的方法，需要强制类型转换  todo 有问题测试失败
    @DeclareParents(value = "com.marvin.spring.demo.Performance+", defaultImpl = PlayImpl.class)
    public Play play;
}
