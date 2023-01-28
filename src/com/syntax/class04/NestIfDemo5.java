package com.syntax.class04;

public class NestIfDemo5 {
    public static void main(String[] args) {

        int money = 1000;
        String day = "Sunday";
        boolean mood = false;

        if (money > 700) {

            if (mood) {
                System.out.println("Let's go shopping");
            } else {
                System.out.println("Let's save money first");
            }
        }
    }
}

