package ReplitPractice;

public class R162 {
    /*
    Overload static method and then execute both overloaded methods.
    **Expected Output:**
    static method without parameter
    static method with int parameter
     */

    class Main {
        public static void myMethod() {
            System.out.println("static method without parameter");
        }

        public static void myMethod(int x) {
            System.out.println("static method with int parameter");
        }

        public static void main(String[] args) {
            // calling the overloaded methods
            myMethod();
            myMethod(10);
        }
    }
}
