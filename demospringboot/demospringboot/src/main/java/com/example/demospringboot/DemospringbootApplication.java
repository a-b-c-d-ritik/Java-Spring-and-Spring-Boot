package com.example.demospringboot;

import com.example.demospringboot.model.Laptop;
import com.example.demospringboot.service.Laptopservice;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemospringbootApplication {

	public static void main(String[] args) {
		try {
			ApplicationContext context = SpringApplication.run(DemospringbootApplication.class, args);

			/*Alien obj = context.getBean(Alien.class);
			System.out.println(" Started ");
			obj.code();*/

			Laptopservice dervice = context.getBean(Laptopservice.class);

			Laptop lap = context.getBean(Laptop.class);
			service.addLaptop(lap);


		} catch (BeansException e) {
			System.out.println(e);
		}
	}

	public static class LaptopRepository {

	}
}
