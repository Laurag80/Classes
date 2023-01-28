package com.syntax.class06;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        /*
        5) Write a program to find largest of three double values using
        if-else..if and logical operators provided by a user (numbers must be distinct)
         */

        Scanner scanner=new Scanner(System.in);
        double number1,number2,number3;
        System.out.println("Please Enter three Numbers");
        number1=scanner.nextDouble();
        number2=scanner.nextDouble();
        number3=scanner.nextDouble();

        if(number1>number2&&number1>number3){
            System.out.println("The Largest Number is "+number1);
        }else if(number2>number3&&number2>number1){
            System.out.println("The largest number is "+number2);
        } else if (number3>number2&&number3>number1) {
            System.out.println("The largest number is "+number3);

        }
    }
}
