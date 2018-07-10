package com.marvin.spring.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 观众-切面
 */
@Aspect//声明这是一个切面类
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
}
