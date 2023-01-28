package HomeWork08;

public class Task6 {
    public static void main(String[] args) {
        //6) How would you swap  2 strings without a temporary variable?

        String a="Java";
        String b="Class";

        System.out.println("before swapping = "+a+" "+b);

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println("the swapping result is = "+a+" "+b);
    }
}
