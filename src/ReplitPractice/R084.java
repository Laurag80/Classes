package ReplitPractice;

public class R084 {
    public static void main(String[] args) {

        //Write a program that prints the total number of elements that are negative AND odd

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int total=0;
        for(int i=0; i<a.length; i++){
            total-=a[i][0];
        }
        System.out.println(total);
    }
}

