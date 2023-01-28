package com.syntax.review02;

public class NestedIf {
    public static void main(String[] args) {

        boolean vaccine=true;
        int dose=1;

        if(vaccine){
            System.out.println("How many doses?");
            if(dose==1) {
                System.out.println("You need second shot");
            }else{
                System.out.println("You are fully vaccinated");
            }
        }
    }
}
