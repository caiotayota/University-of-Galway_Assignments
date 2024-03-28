import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Driver {

    // Create a scanner to take user input.
    Scanner sc = new Scanner(System.in);

    // Create an ArrayList to store Contact objects.
    ArrayList<Contact> contacts = new ArrayList<>();

    // Constructor that initializes the Driver and generates some random contacts.
    public Driver() {
        generateRandomContacts();
    }

    // Display the list of contacts using an iterator.
    public void displayContacts() {
        System.out.println("\nContacts:");

        // Create an iterator to traverse the list of contacts.
        Iterator<Contact> it = contacts.iterator();

        // Use the iterator to display each contact using the overridden toString() method.
        it.forEachRemaining(System.out::println);
    }

    // Display the number of contacts in the list.
    public void displayListSize() {
        System.out.println("The size of the list is: " + contacts.size());
    }

    // Get the index of a contact based on the user's input.
    public int getContactIndex() {
        int contactIndex = -1;

        // Prompt the user to enter a contact name.
        System.out.print("\nEnter the contact name: ");
        String name = sc.next();

        // Check if the input matches the name of a contact (case-insensitive).
        for (Contact contact : contacts) {
            if (contact.name.equalsIgnoreCase(name)) {
                contactIndex = contacts.indexOf(contact); // Get the index of the matching contact in the list.
            }
        }

        // Inform the user if the contact was not found.
        if (contactIndex == -1) {
            System.out.println("\n* Contact " + name + " was not found! *");
        }

        // Return the index of the found contact (or -1 if not found).
        return contactIndex;
    }

    // Delete a contact from the list.
    public void deleteContact() {
        int index = getContactIndex(); // Get the index of the contact to be deleted.

        // If the contact was not found, return without deleting.
        if (index == -1) return;

        // Get the name of the contact to be deleted.
        String name = contacts.get(index).getName();

        // Remove the contact from the list.
        contacts.remove(index);

        // Inform the user that the contact was successfully deleted.
        System.out.println("\n* Contact " + name + " was deleted! *");

        // Display the updated list of contacts.
        displayContacts();

        // Display the updated size of the list.
        displayListSize();
    }

    // Add some pre-defined contact objects to the list.
    public void generateRandomContacts() {
        contacts.add(new Contact("Peter", 353012345678L));
        contacts.add(new Contact("Mary", 353123456789L));
        contacts.add(new Contact("Robert", 353234567890L));
        contacts.add(new Contact("Sara", 353345678901L));
    }
}
