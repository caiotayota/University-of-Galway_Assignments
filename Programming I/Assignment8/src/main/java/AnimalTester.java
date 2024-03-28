import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// A class to test various functionalities related to Animal objects
public class AnimalTester {
    public static void main(String[] args) {

        // Creating instances of Dog and Cat objects
        Animal dog1 = new Dog("Bob", "Akita", 8);
        Animal dog2 = new Dog("Bilu", "Husky", 7);
        Animal dog3 = new Dog("Toto", "Dalmatian", 9);
        Animal cat1 = new Cat("Kay", "Sphinx", 1);
        Animal cat2 = new Cat("Lorny", "Birman", 3);
        Animal cat3 = new Cat("Plog", "Maine Coon", 2);

        // Creating a list to store Animal objects
        LinkedList<Animal> animals = new LinkedList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);
        animals.add(cat1);
        animals.add(cat2);
        animals.add(cat3);

        // Displaying the original content of the list
        System.out.println("List content:");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        // Sorting the list by animal names and displaying the sorted content
        Collections.sort(animals);
        System.out.println("\nList content sorted by name:");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        // Comparator class for sorting animals by breed
        class BreedCompare implements Comparator<Animal> {
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getBreed().compareTo(animal2.getBreed());
            }
        }

        BreedCompare breedCompare = new BreedCompare();
        Collections.sort(animals, breedCompare);

        // Displaying the list sorted by breed
        System.out.println("\nList content sorted by breed:");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        // Comparator class for sorting animals by size
        class SizeCompare implements Comparator<Animal> {
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getSize() - animal2.getSize();
            }
        }

        SizeCompare sizeCompare = new SizeCompare();
        Collections.sort(animals, sizeCompare);

        // Displaying the list sorted by size
        System.out.println("\nList content sorted by size:");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        // Serializing the list of animals
        serialise(animals);
        System.out.println("\nDeserialized content: ");
        deserialize(animals);
    }

    // Method to serialize the list of animals to a file
    public static void serialise(LinkedList<Animal> animals) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("animals.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(animals);
            objectOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to deserialize and display the content of animals from the file
    public static void deserialize(LinkedList<Animal> animals) {
        try {
            FileInputStream fileInputStream = new FileInputStream("animals.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            LinkedList<Animal> animals1 = (LinkedList<Animal>) objectInputStream.readObject();
            for (Animal animal : animals1) {
                System.out.println(animal.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
