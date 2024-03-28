// Dog class extending the Animal class
public class Dog extends Animal {

    // Default constructor for Dog
    public Dog() {
        super(); // Calling the default constructor of the superclass (Animal)
    }

    // Constructor with parameters for Dog
    public Dog(String name, String breed, int size) {
        super(name, breed, size); // Calling the superclass (Animal) constructor with parameters
    }

    // Method to represent the sound of a dog
    public String sound() {
        return "Woof, woof..."; // Returns the sound a dog makes
    }
}
