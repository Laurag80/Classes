package ReplitPractice;

import java.util.Scanner;

public class ForLoop063 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x=scan.nextInt();
        for(int a=0 ;a<x;a++){

            System.out.print(a +" ");
        }
        scan.close();
    }
}
