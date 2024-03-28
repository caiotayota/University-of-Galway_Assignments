// Import the Serializable interface for object serialization.
import java.io.Serializable;

// This is the Circle class, which extends the abstract Shapes class and implements the Serializable interface.
public class Circle extends Shapes implements Serializable {
    // Private instance variables to store the radius and the mathematical constant PI.
    private double radius;
    private double PI;

    // Default constructor for the Circle class, initializes the radius to 0.
    public Circle() {
        this(0);
    }

    // Parameterized constructor that allows setting the radius during object creation.
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to retrieve the radius of the circle.
    public double getRadius() {
        return radius;
    }

    // Setter method to set the radius of the circle.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override of the toString method to provide a customized string representation of the Circle object.
    @Override
    public String toString() {
        calculateArea();
        return "Circle (Radius: " + getRadius() +
                ", Area: " + getArea() + ")";
    }

    // Implementation of the abstract method to calculate the area of the circle based on its radius.
    @Override
    void calculateArea() {
        area = Math.PI * Math.pow(radius, 2);
    }
}
