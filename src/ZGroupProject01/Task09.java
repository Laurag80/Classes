package ZGroupProject01;

public class Task09 {
    public static void main(String[] args) {
        // 9)Maximum and minimum number in the array?

        int arr[] = {9, 15, 55, 17, 3};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        System.out.println("The maximum arr is " + max);
        System.out.println("The minimum arr is "+min);
    }
}