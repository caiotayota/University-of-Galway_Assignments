import java.io.Serializable;

// An abstract class representing an Animal
public abstract class Animal implements Comparable<Animal>, Serializable {

    private String name; // The name of the animal
    private String breed; // The breed of the animal
    private int size; // The size of the animal

    // Default constructor
    public Animal() {
        super();
    }

    // Constructor with parameters
    public Animal(String name, String breed, int size) {
        super();
        this.name = name;
        this.breed = breed;
        this.size = size;
    }

    // Get the name of the animal
    public String getName() {
        return name;
    }

    // Set the name of the animal
    public void setName(String name) {
        this.name = name;
    }

    // Get the breed of the animal
    public String getBreed() {
        return breed;
    }

    // Set the breed of the animal
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Get the size of the animal
    public int getSize() {
        return size;
    }

    // Set the size of the animal
    public void setSize(int size) {
        this.size = size;
    }

    // Override toString method to represent Animal's information
    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", Breed: '" + breed + '\'' +
                ", Size:" + size;
    }

    // Override compareTo method to compare animals based on their names
    @Override
    public int compareTo(Animal animal) {
        return this.getName().compareTo(animal.getName());
    }
}
