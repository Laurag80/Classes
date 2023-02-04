package com.syntax.class19;

public class Student {
    String name;
    String address;
    int age;

    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age=age;
    }

     void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: "+this.age);
    }
}
