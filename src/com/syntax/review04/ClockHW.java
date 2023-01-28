package com.syntax.review04;

public class ClockHW {
    public static void main(String[] args) {

        System.out.println("******* Clock *******");

        for (int i = 0; i <=2 ; i++) {
            for (int j = 0; j <=3 ; j++) {
                for (int k = 0; k <=5 ; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        System.out.println( i+ " "+j+":"+" "+k+" "+ l+"");
                    }
                }
            }
        }
    }
}
