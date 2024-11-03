import java.io.Serializable;

public class Circle extends Shape implements Serializable {
    private static final long serialVersionUID = 4L;

    private int radius;

    public Circle(int radius) {
        if (radius <=0) {
            System.out.println("Invalid radius provided. Setting default radius of 1.");
            this.radius =1; // Default radius
        } else {
            this.radius = radius;
        }
    }

    public int getRadius() {
        return radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayCircleInfo() {
        System.out.println("Circle Information:");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5); // Passing an invalid radius to test default behavior
        circle.displayCircleInfo();
    }
}





