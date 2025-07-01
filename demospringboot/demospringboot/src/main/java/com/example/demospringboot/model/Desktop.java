package com.example.demospringboot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public abstract class Desktop implements Computer
{
    public void Compile(){
        System.out.println("Desktop is Compiling");
    }

}
