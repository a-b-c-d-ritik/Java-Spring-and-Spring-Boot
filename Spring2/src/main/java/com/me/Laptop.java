package com.me;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("laptop obj");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiled using laptop");
    }
}
