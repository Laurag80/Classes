package ZGroupProject01;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        // 10)Write a java program to find the second largest number in the array?

        int[] num = {6,3,8,5,9,2};

        int largest = 0;
        int seconLargest = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                seconLargest = largest;
                largest = num[i];
            } else if (num[i] > seconLargest) {
                seconLargest = num[i];
            }
        }
        System.out.println("Second largest number is " + seconLargest);

    }
}
