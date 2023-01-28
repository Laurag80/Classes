package ZGroupProject01;

public class Task07 {
    public static void main(String[] args) {

        /*
        7)Write a java program to check
        whether a given number is prime or not?
        2,3,5,7,11,13
         */
        int num = 13;
        int count=0;
        for (int i = 2; i <= num / 2; ++i) {

            if (num % i == 0) {
                count++;
                break;
            }
        }

        if (count==0)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
