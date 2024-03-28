public class Main {

    public static void main(String[] args) {
        // Create a new instance of the Driver class.
        Driver driver = new Driver();

        // Display the list of contacts stored in the driver object.
        driver.displayContacts();

        // Display the size (number of contacts) of the contact list.
        driver.displayListSize();

        // Delete a contact from the list if it exists, and display the updated list and size.
        driver.deleteContact();
    }
}
