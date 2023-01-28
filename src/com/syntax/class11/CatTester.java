package com.syntax.class11;

public class CatTester {
    public static void main(String[] args) {
        // creating an object from the Cat Class
        Cat cat1=new Cat();
        cat1.name="lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Gray";
        cat1.attitude=false;
        cat1.eat();

        Cat cat2=new Cat();
        cat2.name="lorki";
        cat2.breed="Domestic";
        cat2.color="white";

        System.out.println(cat2.breed);
        cat2.speak();


    }
}
