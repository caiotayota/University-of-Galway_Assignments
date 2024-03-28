// Define a class named Contact, which represents a contact with a name and a phone number.
public class Contact {

    // Declare instance variables for name and number.
    String name;
    long number;

    // Constructor to initialize the Contact object with a name and a phone number.
    public Contact(String name, long number) {
        this.name = name;
        this.number = number;
    }

    // Getter method to retrieve the name of the contact.
    public String getName() {
        return name;
    }

    // Setter method to update the name of the contact.
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the phone number of the contact.
    public long getNumber() {
        return number;
    }

    // Setter method to update the phone number of the contact.
    public void setNumber(long number) {
        this.number = number;
    }

    // Override the toString() method to provide a custom string representation of the Contact object.
    @Override
    public String toString() {
        return "Name: '" + name + '\'' +   // Format the name
                ", Number: " + number;     // Format the phone number
    }
}
