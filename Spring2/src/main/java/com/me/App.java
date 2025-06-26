package com.me;

import com.me.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("we are using java based configuration");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       /* Desktop dt= context.getBean("desktop1",Desktop.class);
        dt.compile();

        Desktop dt1= context.getBean("com1",Desktop.class);
        dt1.compile();

        Desktop dt2= context.getBean("com2",Desktop.class);
        dt2.compile();


        Desktop dt= context.getBean(Desktop.class);
        dt.compile(); */

        Alien obj1=context.getBean(Alien.class);
        //obj1.setAge(27);
        System.out.println(obj1.getAge());
        //obj1.code();


    }
}