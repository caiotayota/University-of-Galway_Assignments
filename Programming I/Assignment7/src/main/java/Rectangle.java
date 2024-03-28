// Import the Serializable interface for object serialization.
import java.io.Serializable;

// This is the Rectangle class, which extends the abstract Shapes class and implements the Serializable interface.
public class Rectangle extends Shapes implements Serializable {
    // Private instance variables to store the length and width of the rectangle.
    private double length;
    private double width;

    // Default constructor for the Rectangle class, initializes the length and width to 0.0.
    public Rectangle() {
        this(0.0, 0.0);
    }

    // Parameterized constructor that allows setting the length and width during object creation.
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter method to retrieve the length of the rectangle.
    public double getLength() {
        return length;
    }

    // Setter method to set the length of the rectangle.
    public void setLength(double length) {
        this.length = length;
    }

    // Getter method to retrieve the width of the rectangle.
    public double getWidth() {
        return width;
    }

    // Setter method to set the width of the rectangle.
    public void setWidth(double width) {
        this.width = width;
    }

    // Override of the toString method to provide a customized string representation of the Rectangle object.
    @Override
    public String toString() {
        calculateArea();
        return "Rectangle: (Length: " + getLength() +
                ", Width: " + getWidth() +
                ", Area: " + getArea() + ")";
    }

    // Implementation of the abstract method to calculate the area of the rectangle based on its length and width.
    @Override
    void calculateArea() {
        area = length * width;
    }
}
