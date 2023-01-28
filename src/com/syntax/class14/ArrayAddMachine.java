package com.syntax.class14;

public class ArrayAddMachine {
    public static void main(String[] args) {
        int [] arr2={10,10,30,45,30};
        addArrayElements(arr2);
        int [] arr3={20,20,40,40};
        addArrayElements(arr3);
    }
    static void addArrayElements(int [] arr){
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);
    }
}
