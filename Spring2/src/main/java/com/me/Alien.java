package com.me;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("32")
    private int age;
    // private Laptop lap= new Laptop(); -> so if we want to avoid object creation use ref in xml section
    private Desktop lap;
    @Autowired
    @Qualifier("laptop") // class name in lowercase
    private Computer com;

    public Alien(){
        System.out.println("Object created");
    }

    public Alien(int age) {
        System.out.println("parameterized constructor");
        this.age = age;
    }
/*//* one more constructor
    public Alien(int age, Laptop l) {
        System.out.println("parameterized constructor 2");
        this.age = age;
        this.lap=l;
    }*/

    // one more constructor
    public Alien(int age, Computer com) {
        System.out.println("parameterized constructor 2");
        this.age = age;
        this.com=com;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

   public Desktop getLap() {
        return lap;
    }

    public void setLap(Desktop lap) {
        this.lap = lap;
    }



    public void code(){

        System.out.println("ALien coded");
        com.compile();
    }

    public void setcom(Computer com) {

        this.com = com;
    }


}
