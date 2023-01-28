package HomeWork07;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        3) Write a program that reads two people's first
        names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY
  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mom's first name");
        String momName = scan.next();
        System.out.println("Father's first name");
        String dadName = scan.next();
        System.out.println("Is it boy or girl?");
        String babyName = scan.next();


        if (babyName.equalsIgnoreCase("boy")) {

            int gen = momName.length();
            String boyName = dadName.substring(0, 3) + momName.substring(gen - 2, gen);
            System.out.println("Suggested baby name is: " + boyName);


        }
        if (babyName.equalsIgnoreCase("girl")) {
            int gen2 = dadName.length();
            String girlName = momName.substring(0, 2) + dadName.substring(gen2 - 3, gen2);
            System.out.println("Suggested baby name is: " + girlName);
        }
    }
}
