// Import necessary Java libraries for file I/O and data serialization.
import java.io.*;
import java.util.ArrayList;
import java.util.List;

// This is the main class "ShapeDriver" that demonstrates the usage of shapes, serialization, and deserialization.
public class ShapeDriver implements Serializable {
    public static void main(String[] args) {
        // Create a list to store different shape objects.
        List<Shapes> shapes = new ArrayList<>();

        // Add instances of Rectangle and Circle to the shapes list.
        shapes.add(new Rectangle(10, 30));
        shapes.add(new Rectangle(15, 45));
        shapes.add(new Circle(3.5));
        shapes.add(new Circle(6));
        System.out.println();

        // Find and print the largest shape in the collection.
        System.out.println("The largest Shape in the collection is: " + largestShape(shapes).toString());
        System.out.println();

        // Serialize the list of shapes to a file.
        serialize(shapes);

        // Deserialize and print the shapes from the serialized file.
        deserialize();
    }

    // This method finds and returns the largest shape in the list based on their areas.
    private static Shapes largestShape(List<Shapes> shapes) {
        Shapes largestShape = shapes.get(0);

        for (Shapes shape : shapes) {
            shape.calculateArea();
            largestShape = largestShape.getArea() > shape.getArea() ? largestShape : shape;
        }

        return largestShape;
    }

    // Serialize the list of shapes and save them to a file.
    public static void serialize(List<Shapes> shapes) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Shapes.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(shapes);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Deserialize the shapes from a file and print them.
    public static void deserialize() {
        try {
            FileInputStream fileInputStream = new FileInputStream("Shapes.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<Shapes> shapes = (ArrayList<Shapes>) objectInputStream.readObject();

            for (Shapes shape : shapes) {
                System.out.println(shape.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
