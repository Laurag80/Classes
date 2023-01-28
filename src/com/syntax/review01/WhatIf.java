package com.syntax.review01;

public class WhatIf {
    public static void main(String[] args) {

        int a=10;
        int b=20;
        String c ="Hello";
        String d="Java";
        System.out.println(a+b+c+d);// 30HellowJava
        System.out.println(a+c+d+b); //10HellowJava20
        System.out.println(c+d+a+b); //HellowJava1020
        System.out.println(c+d+(a+b)); //HellowJava30

        //Arithmetic Operators +, -. -, /, %
    }
}
