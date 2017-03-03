package com.gmail.lizaiatsenko;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Service {

    public void makeLog(){
        System.out.println("effectuating a logging");
    }
    public void printValue(Object obj){
        System.out.println(obj);
        System.out.println("hello");
    }
}
