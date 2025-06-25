package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("New java App");

		/*Alien obj= new Alien();
		obj.code();*/
		// But we want the spring to create object itself
		ApplicationContext AC=SpringApplication.run(DemoApplication.class, args);
		Alien obj=AC.getBean(Alien.class);
		obj.code();

		laptop l1=AC.getBean(laptop.class);
		l1.compile();
	}

}
