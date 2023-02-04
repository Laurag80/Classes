package com.syntax.class19;

public class Donkey {

    String name;
    int age;
    double weight;

/*
    Donkey(){
        System.out.println("This is non argument constructor");
    }
*/
    Donkey(String donName, int donAge, int donWeigt){
        this.name=name;
        this.age=age;
        this.weight=donWeigt;
    }

    void print(){
        System.out.println("Donky's name is "+name+" Donky's age is "+age+" donkey's weight is "+weight);
    }
}
