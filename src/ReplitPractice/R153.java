package ReplitPractice;

public class R153 {
    /*
    In parent class
    Create a non argument constructor and write a logic to print "This is Parent constructor"
    Create a Child Class that will be subclass of the Parent class.
    Create a constructor without parameter and call parent class constructor expicitly
    In Main Class.
    Create and object of Child class and run the application.
    **Expected Output:**
    This is Parent constructor
``` */

    class Parent {
        Parent() {
            System.out.println("This is Parent constructor");
        }
    }

    class Child extends Parent {
        Child() {
            super();
        }
    }

   /* class Main {

        public static void main(String[] args) {

            new Child();
        }
    }*/
}
