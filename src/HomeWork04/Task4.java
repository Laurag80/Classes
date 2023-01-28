package HomeWork04;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
        If user give more money program should return a change.
         Whenever a user done with payments program should say "Thank you for shopping!"
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an item you would like to buy");
        String itemToBuy=scanner.nextLine();
        System.out.println("Please enter the price of this item");
        int itemPrice=scanner.nextInt();

        int money;
        int sum=0;


        do {
            System.out.println("Please enter the amount of money you can pay right now");
            money=scanner.nextInt();
            sum= sum +money;
            if (sum<itemPrice) {
                System.out.println("You still owe " + (itemPrice - sum));
            } else {
                System.out.println("Your "+itemToBuy+ "is paid in full. Thank you for shopping");
            }
        } while (money<itemPrice);
        ++money;

    }
    }

