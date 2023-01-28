package ZGroupProject01;

public class Task06 {
    public static void main(String[] args) {
         /*6)Write a program to
        swap 2 numbers without a temporary variable?*/

        int a=20;
        int b=30;
        System.out.println("Enter 2 values to swap");

        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("a equals to "+a);
        System.out.println("b equal to "+b);
    }
}
