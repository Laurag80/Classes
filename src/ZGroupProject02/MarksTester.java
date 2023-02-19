package ZGroupProject02;

public class MarksTester {
    public static void main(String[] args) {

         A studentA = new A(70.0, 80.0, 90.0);
        System.out.println("Student A average marks: " + studentA.getAverage());

        B studentB = new B(80.0, 85.0, 90.0, 95.0);
        System.out.println("Student B average marks: " + studentB.getAverage());
    }
}
