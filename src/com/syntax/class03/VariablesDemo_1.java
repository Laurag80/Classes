package com.syntax.class03;

public class VariablesDemo_1 {
    public static void main(String[] args) {
        int age=10; // requesting the computer to create a box of the type int and store a value 10 in it
        int salary = 0; //only create a box of type int and don't assign any value to it.
        // salary=12000;   //updating/reassigning a variable
        System.out.println(salary); // we can creathe multiple empty boxes in a single line of code
        /* String name;
        String city;
        String country;
         */
        String name,city,country;
        char gender,letter;
        name="Daria"; //storing a value in the variable
        //System.out.println(city); I have not stored anything inside the variable that's why java is confused
        System.out.println(name);
    }
}
