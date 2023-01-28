package com.syntax.class09;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

         /*2)
        Create a program that will be asking user to apply for a credit card 10 times.
         As soon you get an “yes” from a user program should stop asking.
         */

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you need a credit card?");
            String userResponce=scanner.next();
            if(userResponce.equalsIgnoreCase("yes")){
                break;
            }
            scanner.close();
        }

    }
}
