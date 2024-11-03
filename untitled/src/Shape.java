import java.io.Serializable;

public class Shape implements Serializable {
    private static final long serialVersionUID = 1L;

    // Fields, methods, and any other existing code for Shape class
    protected String color = "Blue";

    // Constructor, if any
    public Shape() {
        // Initialization code, if any
    }

    // Example method
    public double calculateArea() {
        // Example placeholder logic for calculating area
        return 0;
    }

    public double calculatePerimeter() {
        // Example placeholder logic for calculating perimeter
        return 0;
    }

    public static void displayColor() {
        System.out.println("The color is blue.");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}

