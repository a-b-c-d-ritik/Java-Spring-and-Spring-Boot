package com.me;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String args[]){
       try {
           System.out.println("App");

           ApplicationContext AC = new ClassPathXmlApplicationContext("spring.xml"); // create container

           Alien obj1 = (Alien) AC.getBean("Alien11");
           //obj1.setAge(29);
           System.out.println(obj1.getAge());
           obj1.code();
           //obj.code();
           Alien obj2 = AC.getBean("Alien1",Alien.class);// if not want to typecast
           obj2.code();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}