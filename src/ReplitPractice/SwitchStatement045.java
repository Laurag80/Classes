package ReplitPractice;

import java.util.Scanner;

public class SwitchStatement045 {
    public static void main(String[] args) {
        /*
        Ask the user to enter any number from 1-7.
        Based on the number define the day of the week
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number from 1-7");
        int num=scan.nextInt();
        switch (num) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");

        }
        scan.close();
    }
}
