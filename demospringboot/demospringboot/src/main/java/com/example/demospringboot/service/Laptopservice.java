package com.example.demospringboot.service;

import com.example.demospringboot.DemospringbootApplication;
import com.example.demospringboot.LaptopRepository;
import com.example.demospringboot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Laptopservice {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("called");
        repo.save(lap);
    }


    public boolean isgoodforprog(Laptop lap){
        return true;
    }
}
