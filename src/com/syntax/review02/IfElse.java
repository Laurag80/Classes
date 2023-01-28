package com.syntax.review02;

public class IfElse {
    public static void main(String[] args) {

          /* if statement

        if(boolean condition){
                code A;
        }else{
                code B;
         */

        int num = 12;

        if (num > 100) {
            System.out.println(num + " is greater than a 100");
        } else {
            System.out.println(num + " is less then a 100");
        }

        String button = "Enroll today";

        if(button.equals("Enroll today")) {
            System.out.println("Test case pass");

        }else{
            System.out.println("Test case failed");
        }

    }
}
