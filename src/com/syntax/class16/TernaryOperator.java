package com.syntax.class16;

public class TernaryOperator {
    public static void main(String[] args) {

        int nuber=0;
        /*if(3>2){
            nuber=10;
        }else {
            nuber=20;
        }
        System.out.println(nuber);*/

        nuber=(3>2)?10:20;
        nuber=(3>2)?(4>2)?15:65:20;
        System.out.println(nuber);
    }
}
