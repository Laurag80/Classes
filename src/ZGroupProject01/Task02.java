package ZGroupProject01;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        2)Using Scanner create an array of countries. When an array is created,
        retrieve all values from it and while retrieving those values print
        capital for each country. (use 2 different loops).
         */
        Scanner scan = new Scanner(System.in);
        String[] countries = {"Armenia", "Italy", "France", "Germany",};
        String[] capital = {"Yerevan", "Rome", "Paris", "Berlin"};

        System.out.println("How many countries you want to enter?");
        int size = scan.nextInt();

        System.out.println("Please enter the country");
        String country = scan.next();

        for (int i = 0; i < country.length(); i++) {
            for (int j = 0; j < capital.length; j++) {

                System.out.println("The capital of " + countries[i] + " is " + capital[j]);
            }
            scan.close();
        }
    }
}
