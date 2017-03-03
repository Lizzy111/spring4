package com.gmail.lizaiatsenko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by liza on 03/03/2017.
 */
public class Launch {
    public static void main(String[] args){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        FileManager fileManager= (FileManager)context.getBean("fileManager");
        fileManager.sayHello();
//        String folder= "c:\\Windows\\System32";
//        fileManager.getExtentionCount(folder);

    }
}
