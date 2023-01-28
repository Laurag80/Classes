package HomeWork02;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */

        Scanner in=new Scanner (System.in);
        System.out.println("What is your city?");
        String city=in.nextLine();
        System.out.println("please enter the temperature");
        int tempF=in.nextInt();
        double tempC=(tempF-32)*0.5;
        int convertTempC=(int)tempC;
        System.out.println("The temperature in the city is "+city+" is "+convertTempC+"C");
    }
}
