package com.syntax.review01;

public class WorkingWithVariables {
    public static void main(String[] args) {
        // create a variable and store value into it
        // declare a variable and initialised
        int number=10;

        //declare a variable
        int num;  // declaration of a variable happens only once
        num=100;  //initialize the variable
        num=200;  //reassign the value

        System.out.println(num); //

        boolean hungry=false;
        hungry=true;
        System.out.println(hungry);

        String myString="Hello";
        String name="Laura";
        String address=("123 Test Drive");
        System.out.println(myString+" "+name);
        int age=21;
        System.out.println(name+" is "+age+ " years old");

        /*
        If we want to attach String to anything:
        string to int
        string to int
        string to boolean
        string to char......
        we use +
         */

        //when we have 2 numeric values + acts as addition
        System.out.println(number+num);

        String n1="10";
        System.out.println(n1+num);

        String month="December";
        int day=14;
        System.out.println(day+"th"+ " of "+month);

        char date='1';
        System.out.println(date+month); //63

        System.out.println(date+day);





    }
}
