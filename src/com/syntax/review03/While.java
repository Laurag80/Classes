package com.syntax.review03;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int i=1;

        while (i<=4){

            System.out.println("Hello");
            i++;
        }
        /* ask user if he/she is tired
        as long as user is not tiered -> we will say le's study Java*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Are you tired?");

        boolean tired=scan.hasNextBoolean();

        while (!tired){

            System.out.println("This is great");
            System.out.println("Let's study Java");
            System.out.println("Are you tired?");
            tired=scan.nextBoolean();
            System.out.println();
        }
        scan.close();
    }
}
