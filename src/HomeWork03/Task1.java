package HomeWork03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*1) Prompt the user to enter person heights in inches. Person should be classified as one of the following:
        • short (under 60 inch)--------• medium(between 60 -72 inch)--------• tall (over 72 inch)*/

        Scanner hight=new Scanner(System.in);
        System.out.println("Please enter person's height in inches");
        double number=hight.nextDouble();

        if(number<60){
            System.out.println("short");
        } else if (number>60&&number<72)
        {
            System.out.println("medium");
        } else if (number>72)
        {
            System.out.println("tall");
        }
        hight.close();
    }
}
