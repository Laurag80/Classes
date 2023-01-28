package ReplitPractice;

public class Arrays079 {
    public static void main(String[] args) {
      /*  Write a program to print values from a 2D array
          **Example Output:**
           1.4 2.0 3.3 2.0
            4.0 1.5 6.1 1.0
            1.2 3.1 4.0 1.6
                    ```*/

        double[][] value={{1.4,2.0,3.3,2.0},
                {4,1.5,6.1,1.0},
                {1.2,3.1,4,1.6},
        };
        for(double[] values: value){
            for(double aValue : values){
                System.out.print(aValue+" ");
            }
            System.out.println();
        }
    }
}
