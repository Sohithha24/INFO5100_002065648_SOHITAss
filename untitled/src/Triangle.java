import java.io.Serializable;

public class Triangle extends Shape implements Serializable {
    private static final long serialVersionUID = 2L;

    // Existing fields, methods, and constructor remain unchanged.
    private int base;
    private int height;
    private int sideA;
    private int sideB;
    private int sideC;

    // Constructor
    public Triangle(int base, int height, int sideA, int sideB, int sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Method to calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * base * height;
    }
public double calculatePerimeter() {return sideA + sideB + sideC;}
    // Method to print the details of the triangle
    public void printDetails() {
        System.out.println("Triangle Details:");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
        System.out.println("Area: " + calculateArea());

    }
}


