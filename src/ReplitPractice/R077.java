package ReplitPractice;

import java.util.Scanner;

public class R077 {
    public static void main(String[] args) {

        /*
        Create an array of integers that will store 5 elements taken from a user
        Don't print any prompt message for the user
        Then print out all the elements you have created in the first loop in reverse order.  */

        Scanner scan=new Scanner(System.in);
        int[] num=new int[5];
        num[0]=scan.nextInt();
        num[1]=scan.nextInt();
        num[2]=scan.nextInt();
        num[3]=scan.nextInt();
        num[4]=scan.nextInt();
        for(int i=4; i>=0; i--){
            System.out.println(num[i]);
        }
        scan.close();
    }
}
