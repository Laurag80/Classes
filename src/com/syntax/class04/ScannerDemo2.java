package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("please enter your age");
        int age=input.nextInt();
        System.out.println("You are "+age+" years ols");
    }
}
