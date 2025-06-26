package com.me;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Desktop non param constructor ");
    }

    @Override
    public void compile()
    {
        System.out.println("Compiled using Desktop");
    }
}
