package com.me;

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
