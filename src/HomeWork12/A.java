package HomeWork12;

public class A {
    int a;

    void displayA() {
        System.out.println("Value of a: " + a);
    }
}

class B extends A {
    int b;

    void displayB() {
        System.out.println("Value of b: " + b);
    }
}

class C extends B {
    int c;

    void displayC() {
        System.out.println("Value of c: " + c);
    }
}

