package com.syntax.review02;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        int num=10;
        num=11;

        Scanner keyboard=new Scanner(System.in);

        keyboard.nextInt(); // to capture int value
        keyboard.nextBoolean(); // to capture boolean value
        keyboard.next();    // to capture String until space

        System.out.println("Please enter your age");
        System.out.println("are you tired");
        System.out.println("What's your name");

    }
}
