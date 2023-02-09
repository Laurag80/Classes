package com.syntax.class22;

public class Animal {

    String name;
    String color;
    int age;
    double weight;

    void speak(){
        System.out.println("Meow Meow .........");

    }
    void eat(){
        System.out.println("All the animals eat");
    }
}
class Cat extends Animal{

}
class Dog extends Animal{

}
class Tester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speak();
        cat.eat();
    }
}