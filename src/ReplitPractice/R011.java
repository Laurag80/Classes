package ReplitPractice;

public class R011 {
    public static void main(String[] args) {
        /*
        Write a program to print the perimeter and
        area of a rectangle with width = 5 and height = 8.
         */


        int width= 5;
        int height= 8;
        int parameter= width*2+height*2;
        int area= width*height;

        System.out.println("The perimeter of a rectangle with width " +
                ""+width+ " and height "+height+" is equals to "+parameter+" and the area equals to "+area);

    }
}
