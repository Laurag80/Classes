package ReplitPractice;

import java.util.Scanner;

public class R103 {
    public static void main(String[] args) {
       /* Write a for loop that will print out each letter of
        the string s, separated by spaces, on the same line.*/

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    inp.close();
    }
}
