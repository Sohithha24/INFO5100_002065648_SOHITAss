import java.io.Serializable;

public class Rectangle extends Shape implements Serializable {
    private static final long serialVersionUID = 3L;
    private double length, width;

    // Constructor with only length and width as parameters
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override methods from Shape class
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

