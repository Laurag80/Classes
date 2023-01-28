package ReplitPractice;

import java.util.Scanner;

public class SwitchStatement044 {
    public static void main(String[] args) {
        /*
        Prompt user with questions: "Please enter your favorite car make"
        - if user enters  BMW -->  carOrigin = "german car"
        - if user enters  Toyota -->  carOrigin = " japanese car"
        - if user enters  Maserati -->  carOrigin = "italian car"
        - anything else besides those values --> carOrigin = "unknown" */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your favorite care make");
        String car=scan.next();
        switch(car){

            case "BMW":
                System.out.println("Your favorite car is german car");
                break;
            case "Toyota":
                System.out.println("Your favorite car is japanese car");
                break;
            case "Maserati":
                System.out.println("Your favorite car is italian car");
                break;
            default:
                System.out.println("Your favorite car is unknown");
        }
        scan.close();
    }

}
