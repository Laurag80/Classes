package HomeWork04;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*2)
        Create a program that will be asking user to apply for a credit card 10 times.
         As soon you get an “yes” from a user program should stop asking.
         */
        Scanner scanner = new Scanner(System.in);


        for (int request=0; request<10; request++) {
            System.out.println("Do you need a credit card?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }

        }
    }
    }