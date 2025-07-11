package com.me;

public class Alien {

    private int age;
   // private Laptop lap= new Laptop(); -> so if we want to avoid object creation use ref in xml section
    private Laptop lap;
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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }



    public void code(){

        System.out.println("ALien coded");
        lap.compile();
    }
}
