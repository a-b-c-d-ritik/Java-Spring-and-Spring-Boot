package com.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String args[]){
        System.out.println("App");

        ApplicationContext AC = new ClassPathXmlApplicationContext("spring.xml"); // create container

        Alien obj= AC.getBean("Alien");
        obj.code();
    }
}