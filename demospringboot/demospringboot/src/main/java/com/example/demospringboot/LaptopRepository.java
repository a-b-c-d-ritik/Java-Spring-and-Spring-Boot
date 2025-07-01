package com.example.demospringboot;

import com.example.demospringboot.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap){
        System.out.println("called and data saved");
    }
}
