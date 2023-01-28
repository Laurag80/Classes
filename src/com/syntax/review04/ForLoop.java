package com.syntax.review04;

public class ForLoop {
    public static void main(String[] args) {

        // best loo when we kow how many times we need to repeat  block of code

        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);
        }
        // break and continue
        System.out.println("*****************");

        for (int i = 2; i <= 20; i += 5) {
            System.out.println(i);

            if (i == 12) {
                System.out.println("i is equal to 12- I am braking my loop");
                break;
            }
        }
        // continue - skips current itaration
        System.out.println("***********");
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 3) {
                continue;
            }
            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println("Hope you well");
        }
    }
}
