package ZGroupProject01;

public class Task03 {
    public static void main(String[] args) {

        // 3) Create a 2D array of integer values. Print the sum of all numbers.

        int[][] value = {{1, 2, 3},
                         {4, 5, 6},
                        {7, 8, 9},
        };
        int total = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value.length; j++) {
                total += value[i][j];
            }
        }
        System.out.println(total);
    }
}