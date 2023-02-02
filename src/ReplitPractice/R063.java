package ReplitPractice;

import java.util.Scanner;

public class R063 {
    /*
    Write a for loop that will print out a series of numbers starting at 0
    and ending at the x(value must be taken from a user), exclusive.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x=scan.nextInt();
        for(int a=0 ;a<x;a++){

            System.out.print(a +" ");
        }
        scan.close();
    }
}
