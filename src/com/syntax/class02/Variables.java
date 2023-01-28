package com.syntax.class02;

public class Variables {
    public static void main(String[] args) {
        /*
        Bellow line is reserving box in the computer memory,
        we are calling box1 if we need the information tha we need inside the box
        we can simply sa to computer give us the contest of box1.
        box1=> is the name of the box
        10=> is what we are soring inside the box
         */
        int box1=10;
        // if we are printing something from a box we don't need "".
        System.out.println(box1);
       /* Store whole number we have 4 different type of boxes.
        for example like 10 20 300 1000 330000
        1) byte 2) short 3) int 4) long
        */
        byte box2=127; // range for byte is from -128 to 127 if we need larger number I should try short
        byte box3=-128;
        short box4=32767;
        int boggerBox=123457845; // most common type of box
        long maxBox=15000897756825l;

//Reserve a box which can hold the number 10000 call it myBox and print its value on the console
        short myBox=10000;
        System.out.println(myBox);


    }
}
