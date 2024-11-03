import java.io.Serializable;

public class Square extends Shape implements Serializable {
    private static final long serialVersionUID = 5L;

    private int side;

    // Constructor to initialize the side length
    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side; // Correctly using 'side' for area
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side; // Correctly using 'side' for perimeter
    }

    @Override
    public String toString() {
        return "Square{side=" + side + ", color=" + color + "}";
    }
}
