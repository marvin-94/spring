package com.marvin.spring.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 观众-切面
 */
//@Aspect//声明这是一个切面类
public class Audience {

    @Pointcut("execution(* com.marvin.spring.demo.Performance.perform(..))")//将多次使用的切点抽出来
    public void pointCut() {
    }

    @Before("pointCut()")//声明切点方法执行之前执行
    public void sitDown() {
        System.out.println("我坐了下来");
    }

    @Before("execution(* com.marvin.spring.demo.Performance.perform(..))")//声明切点方法执行之前执行
    public void closePhone() {
        System.out.println("关闭了手机");
    }

    @AfterReturning("execution(* com.marvin.spring.demo.Performance.perform(..))")//声明切点方法执行之后执行
    public void success() {
        System.out.println("热烈鼓掌");
    }

    @AfterThrowing("execution(* com.marvin.spring.demo.Performance.perform(..))")//声明切点方法执行报错之后执行
    public void failed() {
        System.out.println("退票");
    }

    @Around("pointCut()")//声明切点方法被包围起来
    public void around(ProceedingJoinPoint pjp) {//这个参数必须要有，因为需要手动将控制权交给切点方法
        try {
            System.out.println("环绕-第一步");
            System.out.println("环绕-第二步");

            pjp.proceed();//将控制权交给切点方法，可以交出去多次

            System.out.println("环绕-第三步");
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Pointcut("execution(* com.marvin.spring.demo.Performance.song(String)) " +
            "&& args(asd2)")//获取被切入对象的参数， 此处参数名字和下面参数名字对应即可，无需与被切入对象一致
    public void cutPoint2(String asd2) {
    }

    @Before("cutPoint2(abc)")
    public void song(String abc) {
        System.out.println("获取到参数" + abc);
    }

    @Pointcut("execution(* com.marvin.spring.demo.Performance.sayInfo(String,int)) " +
            "&& args(asd3,age)")//获取被切入对象的参数,多个按顺序填写， 此处参数名字和下面参数名字对应即可，无需与被切入对象一致
    public void cutPoint3(String asd3, int age) {
    }

    @Before("cutPoint3(name,age)")
    public void say(String name, int age) {
        System.out.println("获取到参数" + name + "---" + age);
    }
}
