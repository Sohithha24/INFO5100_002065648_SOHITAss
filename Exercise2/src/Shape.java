
public abstract class Shape {
    // Static field to represent the color of shapes
    public static String color = "Blue";

    // Abstract methods (force subclasses to implement)
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    // Static method to display the color of shapes
    public static void displayColor() {
        System.out.println("Color of the shapes: " + color);
    }
}

