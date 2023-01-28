package com.syntax.class13;

public class StringRecap {
    public static void main(String[] args) {
        // How can I print all the lwtters from the string one by one
        String str="Java is great";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        // what is the input to the charAt() method its out is a char
        // count how many times the letter a has in the above String

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter has appeared "+count+" Many times");
    }
}
