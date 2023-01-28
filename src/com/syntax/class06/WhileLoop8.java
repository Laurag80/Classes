package com.syntax.class06;

public class WhileLoop8 {
    public static void main(String[] args) {

        //Print below sequence with the help of loop
        //1,2,3,4,6,7,8,9,11,12,1314,16

        /*int num = 0;
        while (num <= 16) {
            if (num%5 != 0) {
                System.out.println(num);
            }
            num += 1;
        }*/
        System.out.println("****************");
        int number2=1;
        while (number2<=16){

            if(number2%5==0){
            }else{
                System.out.println(number2);
            }
            number2++;
        }
    }
}
