package com.syntax.review03;

public class LogicalOperators {
    public static void main(String[] args) {

    boolean loginButtonDisplayed=true;
    boolean loginButtonClickable=true;

    if(loginButtonDisplayed&&loginButtonClickable){
        System.out.println("Test case pass");
    }else {
        System.out.println("Test case failed");
    }
        System.out.println("-------------------------");

    boolean dashboard=false;
    String message="Welcome admin";
    if(dashboard || message.equals("Welcome admin")){
        System.out.println("User is successfully logged in");
    }else {
        System.out.println("User is not logged in");
    }
        System.out.println("--------Logical NOT-----------");

    boolean b=true;
        System.out.println(!true); // false

        boolean agreeCheckBoxSelected=false;
        if(!agreeCheckBoxSelected){
            System.out.println("I am clicking on checkbox");
        }
        System.out.println("I am clicking submit button");

        boolean boo=!false;
        System.out.println(boo); // true
    }

}
