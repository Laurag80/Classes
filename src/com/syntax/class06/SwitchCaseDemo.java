package com.syntax.class06;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="USA";

        System.out.println(country.toLowerCase());

        switch ((country.toLowerCase())){ // converts text to lowercase USA=>usa

            case "usa":
                System.out.println("Burgers");
                break;
            case "Italy":
                System.out.println("Pasta");
                break;
            case "Armenia":
                System.out.println("Tolma");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
