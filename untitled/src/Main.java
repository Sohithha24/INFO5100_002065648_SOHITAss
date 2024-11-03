import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Treating all shapes as Shape objects
        Triangle triangle = new Triangle(3, 4, 3, 4, 5);
        Shape rectangle = new Rectangle(5, 7);
        Circle circle = new Circle(5);
        Shape square = new Square(4);
        // Static field demonstration
        Shape.displayColor();

        // Calling methods via polymorphism
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculateCircumference());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Square Perimeter: " + square.calculatePerimeter());

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("shapes.ser"))) {
            out.writeObject(triangle);
            out.writeObject(rectangle);
            out.writeObject(circle);
            out.writeObject(square);
            System.out.println("Serialization completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("shapes.ser"))) {
            Shape deserializedTriangle = (Shape) in.readObject();
            Shape deserializedRectangle = (Shape) in.readObject();
            Shape deserializedCircle = (Shape) in.readObject();
            Shape deserializedSquare = (Shape) in.readObject();

            System.out.println("Deserialized Triangle: " + deserializedTriangle);
            System.out.println("Deserialized Rectangle: " + deserializedRectangle);
            System.out.println("Deserialized Circle: " + deserializedCircle);
            System.out.println("Deserialized Square: " + deserializedSquare);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
