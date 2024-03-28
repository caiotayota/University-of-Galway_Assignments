// This is an abstract class named "Shapes" that implements the "ShapesRelate" interface.
public abstract class Shapes implements ShapesRelate {
    // This variable stores the area of the shape.
    protected double area;

    // This is a default constructor for the "Shapes" class.
    public Shapes() {
    }

    // This method is used to retrieve the area of the shape.
    public double getArea() {
        return area;
    }

    // This is an abstract method that must be implemented by subclasses to calculate the area of the shape.
    abstract void calculateArea();

    // This method compares two shapes based on their relationship as specified by the "ShapesRelate" interface.
    public int compareShapes(ShapesRelate shapesRelate) {
        return 0;
    }
}
