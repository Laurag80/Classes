package com.syntax.class14;

public class MethodTester2 {
    public static void main(String[] args) {

        // creating object of the class
        MethodsDemo2 md= new MethodsDemo2();
        md.printHello(); // calling a method

        System.out.println("****************");
        //md.printHelloManyTimes(10);
        md.printManyTimes(5, "I love Java");

    }
}
