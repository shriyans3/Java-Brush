package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {

    @Autowired
    New n;

    public void Run(){
        System.out.println("Started");
        n.Run();
    }
}
