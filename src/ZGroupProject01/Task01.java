package ZGroupProject01;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        /*
        1)Using Scanner create an array of integer values.
        After the array is created, calculate the sum of all stored elements in that array.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        //Initialize array
        int [] nums = new int [] {4, 3, 5, 7, 9};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scan.nextInt();
            sum = sum + nums[i];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
    }
}

