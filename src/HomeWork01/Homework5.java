package HomeWork01;

public class Homework5 {
    public static void main(String[] args) {
        /*
        5) Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. Your program should say.
         “The perimeter of a rectangle with width and height __ is equal to __ and the area is __”
         The perimeter of a rectangle with width 5.0 and height 8.0 is equal to 26.0 and the area is 40.0
         */

        int width= 5;
        int height= 8;
        int parameter= width*2+height*2;
        int area= width*height;

        System.out.println("The perimeter of a rectangle with width 5 and height 8 is equal to "+parameter+" and the area is "+area);
    }
}
