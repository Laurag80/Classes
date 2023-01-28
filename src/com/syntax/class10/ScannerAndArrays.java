package com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers");
        int[] numbers = new int[5];//This is a empty array where we want to store 5 numbers
        //inside our variables
        //below code manually store number in the array
       /* number[0]=40;
        number[1]=50;
        number[2]=60;
        number[3]=70;
        number[4]=70;/
        //below code take the numberes from user and store them in the array its good but a lot of code
        /numbers[0]=scanner.nextInt();
        numbers[1]=scanner.nextInt();;
        numbers[2]=scanner.nextInt();;
        numbers[3]=scanner.nextInt();;
        numbers[4]=scanner.nextInt();;*/

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}