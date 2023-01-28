package ReplitPractice;

public class ArithmeticOperations010 {
    /*
    1. Declare 2 numbers and assign values 200 and 100 respectively.
    2. First, add numbers, then subtract, third multiply, forth divide.
    3. Please use variables to print the values of each operation result on a separate line.
    **Output:**
    ```
    300
    ```
    ```
    100
    ```
    ```
    20000
    ```
    ```
    2
    ```
    */
    public static void main(String [] args){

        int v, v1, sum, sub, mult, div;
        v=200;
        v1=100;

        sum=v+v1;
        System.out.println(sum);
        sub=v-v1;
        System.out.println(sub);
        mult=v*v1;
        System.out.println(mult);
        div=v/v1;
        System.out.println(div);
    }
}