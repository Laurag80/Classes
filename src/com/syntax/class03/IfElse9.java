package com.syntax.class03;

public class IfElse9 {
    public static void main(String[] args) {

        char c='M';
        if(c=='M'){
            System.out.println("Male");
        }
        String name="Nat";
        // with non-primitive datatype such a string we can't use == symbol
        if(name.equals("Sam")) {
            System.out.println("Amazing student");
        }
        if(!name.equals("Sam")) {
            System.out.println("Super Amazing student");
        }
    }
}
