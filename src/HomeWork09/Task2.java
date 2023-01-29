package HomeWork09;

public class Task2 {
    // 2) Create a method that will take a number and prints whether the number is even or odd.
    public static void checkEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
    public static void main(String[] args) {
        checkEvenOdd(5); // call the method with an argument of 5
    }
}
