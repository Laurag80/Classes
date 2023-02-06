package HomeWork13;

public class Shape {
    protected double radius;

    public Shape(double radius) {
        this.radius = radius;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        super(radius);
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
