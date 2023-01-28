package ZGroupProject01;

public class Task05 {
    public static void main(String[] args) {

        /*
        5)Create a 2D array of integers. Develop a program which will
        calculate the sum of  even and odd numbers for that array.
         */

        int evenSum = 0;
        int oddSum = 0;
        int[][] arr = {{1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
        };
        System.out.print(" Please Enter Number of elements in an array : ");

        int[] a = new int[arr.length];

       /* System.out.print(" Please Enter " + arr.length + " elements of an Array  : ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; i < arr.length; i++) {
                if (arr[i][j] % 2 == 0) {
                    evenSum = evenSum + a[i][j];
                } else {
                    oddSum = oddSum + a[i][j];
                }
            }
            System.out.println("\n The Sum of Even Numbers in this Array = " + evenSum);
            System.out.println(" The Sum of Odd Numbers in this Array = " + oddSum);
        }*/
    }
}