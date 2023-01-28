package com.syntax.class02;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10; // we don't need to define the data-types again and again java remembers it
        numberBox=20; //we are reassigning number 20 to number box, so it will overwrite 10 with 20
        System.out.println(numberBox);
        numberBox=200;
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox+20);

        int number=20;

        System.out.println("*****--------*******");
        System.out.println(number*1);
        System.out.println(numberBox*5);
        System.out.println(numberBox*10);
        System.out.println(numberBox*15);
    }
}
