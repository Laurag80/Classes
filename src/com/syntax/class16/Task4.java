package com.syntax.class16;

public class Task4 {
        /*
        4)Create a method that will say Hello in different language
        based on the country that will be passed when method is executed
        return type=>String void
        name=sayHello
        parameter => String
        parameter=>String countryName
         */

        String sayHello(String countryName){

            switch (countryName){

                case "USA":
                    return "Hello";
                case "Kazakhistan":
                    return "Salam";
                case "Italy":
                    return "Chao";
                case "China":
                    return "Ni hao";
                default:
                    return "Country not supported";
            }
    }

    public static void main(String[] args) {
        Task4 tas4=new Task4();
        System.out.println(tas4.sayHello("Italy"));
    }
}
