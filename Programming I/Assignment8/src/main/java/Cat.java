// Cat class extending the Animal class
public class Cat extends Animal {

    // Default constructor for Cat
    public Cat() {
        super(); // Calling the default constructor of the superclass (Animal)
    }

    // Constructor with parameters for Cat
    public Cat(String name, String breed, int size) {
        super(name, breed, size); // Calling the superclass (Animal) constructor with parameters
    }

    // Method to represent the sound of a cat
    public String sound() {
        return "Meow..."; // Returns the sound a cat makes
    }
}
