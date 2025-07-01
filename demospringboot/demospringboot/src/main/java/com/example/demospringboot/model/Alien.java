package com.example.demospringboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Alien {
    @Value("")
    private int age;
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }
    @Autowired
    @Qualifier("Laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    /*private Laptop lap;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }
    @Autowired
    @Qualifier("Laptop")
    public void setLap(Laptop lap) {
        this.lap = lap;
    }
*/
    public void code(){
        com.compile();
    }
}
