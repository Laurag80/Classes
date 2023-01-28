package com.syntax.class09;

public class ArrayDemo8 {
    public static void main(String[] args) {

        double[] arr={10.5,12.0,45.0,10.5,23.0,10.5};
        // write a program that can tell us how many times the number 10,5 is present in the array

        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==10.5){
                count++;
            }
        }
        System.out.println(count);
    }
}
