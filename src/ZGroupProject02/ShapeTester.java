package ZGroupProject02;

public class ShapeTester {
    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Square square = new Square(4.0);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}
