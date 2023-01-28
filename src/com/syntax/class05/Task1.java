package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Write a program to find the largest number among three distinct numbers using nested if condition
        Please use Scanner class to take input from users
         */

        int number1=1000, number2=200, number3=300;
        Scanner scan=new Scanner(System.in);
        number1=scan.nextInt();
        number2=scan.nextInt();
        number3=scan.nextInt();

        if(number1>number2){
            if(number1>number3){
                System.out.println("Number is the largest "+number1);
            }
        }
        if(number2>number1){
            if(number2>number3){
                System.out.println("Number 2 is largest "+number2);
            }
        }
        if(number3>number1){
            if(number3>number2){
                System.out.println("Number 3 is largest "+number3);
                scan.close();
            }
        }
    }
}
