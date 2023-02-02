package ReplitPractice;

import java.util.Scanner;

public class R104 {
    public static void main(String[] args) {
        /*Create an array of names that will hold 5 String elements.
        Names must be taking from a user.
        Print out the first three characters of each element of the array, one per line.
        Note: every array element must be at least 3 characters long.*/

        Scanner inp = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = inp.nextLine();
            while (names[i].length() < 3) {
                System.out.println("Name must be at least 3 characters long. Enter again:");
                names[i] = inp.nextLine();
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].substring(0, 3));
        }
        inp.close();
    }
}
