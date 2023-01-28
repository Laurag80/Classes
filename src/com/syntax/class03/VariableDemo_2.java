package com.syntax.class03;

public class VariableDemo_2 {
    public static void main(String[] args) {
        /*
        to rename something right-click refactor->rename
         */
        int age=10;
        System.out.println(age);
        age=20;
        System.out.println(age);
        int number=10; //i am saying java replace the value of age with value of number variable
        age=number;
        age=number+10;
        System.out.println(age);
        age=age+20;
        System.out.println(age);
    }
}
