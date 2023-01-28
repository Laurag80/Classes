package HomeWork02;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        You are DMV representative and you need to ask customer their age.
        If they are 18 and older you will issue a driver licence to them,
        otherwise you will offer them to get a learners permit.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=input.nextInt();
        if(age>18){
            System.out.println("you will get a driver license");
        }else
            System.out.println("get a learners permit");
    }
}
