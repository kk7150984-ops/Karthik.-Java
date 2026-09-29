abstract class Shape {

    // Abstract method
    abstract void area();
}

// Subclass 1
class Circle extends Shape {
    double radius = 5;

    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

// Subclass 2
class Rectangle extends Shape {
    double length = 10;
    double width = 5;

    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.area();
        rectangle.area();
    }
}
