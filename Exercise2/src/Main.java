public class Main {
    public static void main(String[] args) {
        // Polymorphism: Treating all shapes as Shape objects
        Shape triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(3);
        Shape square = new Square(4);

        // Static field demonstration
        Shape.displayColor();

        // Calling methods via polymorphism
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());
    }
}
