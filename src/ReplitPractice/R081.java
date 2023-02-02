package ReplitPractice;

public class R081 {
    public static void main(String[] args) {

        //Write a program that prints the highest value in the array.

        int[][] arr={{5,2,3,7},
                {3,5,1,9},
                {8,3,4,6}
        };
        int max =arr[0][0];
        for(int[] arr1:arr){
            for(int element:arr1){
                if(element>max){
                    max=element;
                }
            }
        }
        System.out.print(max);

    }
}
