package HomeWork01;

public class Homework4 {
    public static void main(String[] args) {
    /*
    4) Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say.
    “The __ of 2 numbers __ and  is equal to __”
Expected Output:
The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
Write a program to find the square of the number 3.9. Your program should say “The square of the  is  “
Expected output:

The square of the 3.9 is 15.209999999999999
     */

    double a,b, sum, sub, mult, div, square;
    a= 10.5;
    b= 3.9;

    sum = a+a;
    System.out.println("The Addition of 2 numbers "+a+" and "+a+" is equal to "+sum);

    sub = a-a;
    System.out.println("The Subtraction of 2 numbers "+a+" and "+a+" is equal to "+sub);

    mult = a*a;
    System.out.println("The Multiplication of 2 numbers "+a+" and "+a+" is equal to "+mult);

    div = a/a;
    System.out.println("The Division of 2 numbers "+a+" and "+a+" is equal to "+div);

    square = b*b;
    System.out.println("The square of the "+b+" is "+square);
    }
}