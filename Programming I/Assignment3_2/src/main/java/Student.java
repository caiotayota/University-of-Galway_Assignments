// Define a class named Student
public class Student {
    // Declare instance variables for student name and ID number
    String name;
    long idNumber;

    // Constructor to initialize the Student object with a name and ID number
    public Student(String name, long idNumber) {
        // Set the name and ID number using the provided arguments
        this.name = name;
        this.idNumber = idNumber;
    }

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }

    // Setter method to set or update the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the student's ID number
    public long getId() {
        return idNumber;
    }

    // Setter method to set or update the student's ID number
    public void setId(long idNumber) {
        this.idNumber = idNumber;
    }

    // Override the toString method to provide a custom string representation of the Student object
    @Override
    public String toString() {
        return  "ID: " + idNumber +               // Display the ID number
                ", Name: '" + name + '\'';      // Display the name in single quotes
    }
}
