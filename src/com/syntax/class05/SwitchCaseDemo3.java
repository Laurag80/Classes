package com.syntax.class05;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {

        char gender = 'M';

        switch (gender) {

            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("not specified");
        }
    }
}
