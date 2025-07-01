package com.example.demospringboot.model;

import org.springframework.stereotype.Component;

@Component
public abstract class Laptop implements Computer
{
    public void Compile(){
        System.out.println("Laptop is Compiling");
    }

}
