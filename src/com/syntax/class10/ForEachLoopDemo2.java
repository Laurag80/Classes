package com.syntax.class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        int[] arr= {10, 13, 20, 25, 45, 50};
        for (int i = 0; i < arr.length ; i+=2) {
            System.out.println(i);

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
