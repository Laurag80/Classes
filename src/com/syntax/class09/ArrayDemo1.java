package com.syntax.class09;

public class ArrayDemo1 {
    public static void main(String[] args) {

        String[] names = {"Slava", "Safi", "Jason", "Nabi", "Anees", "Joseph"};
        // write a loop to print all the names from array
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}