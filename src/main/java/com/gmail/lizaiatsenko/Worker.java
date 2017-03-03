package com.gmail.lizaiatsenko;

import org.springframework.stereotype.Component;

@Component
public class Worker {
    public String getName(){
        return "Liza";
    }

    public int getInt(){
        return 11;
    }
}
