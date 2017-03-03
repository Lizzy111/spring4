package com.gmail.lizaiatsenko;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {

    @Pointcut("within(com.gmail.lizaiatsenko.*)")
    public void getNamePointCut(){}

    @After("getNamePointCut()")
    public void watchTime(){
        long start= System.currentTimeMillis();
//        System.out.println("method begin: "+ joinPoint.getSignature().toShortString());
//        Object output= null;
//        try{
//            output= joinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
//        long time= System.currentTimeMillis()- start;
//        System.out.println("method end: " + joinPoint.getSignature().toShortString() + time);
        System.out.println("advise");
    }
}
