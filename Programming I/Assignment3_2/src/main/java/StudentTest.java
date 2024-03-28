// Import the Random class to generate random values
import java.util.Random;

// Define a class named StudentTest
public class StudentTest {

    // Declare an array of Student objects and initialize it with a size of 100
    Student[] students = new Student[100];

    // Initialize a variable 'id' to keep track of student IDs
    long id = 0;

    // Constructor for the StudentTest class
    public StudentTest() {
        // Generate students when an instance of StudentTest is created
        generateStudents();
    }

    // Method to generate an array of students
    public Student[] generateStudents() {
        for (int i = 0; i < 100; i++) {
            // Create a new Student object with a random name and increment the ID
            students[i] = new Student(generateRandomName(), ++id);
        }

        // Return the array of generated students
        return students;
    }

    // Method to display the information of all students in the array
    public void displayStudents() {
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }

    // Method to generate a random full name by combining random first and last names
    public String generateRandomName() {

        // Arrays of possible first and last names
        String[] firstNames = {
                "Alice", "Bob", "Charlie", "David", "Eva",
                "Frank", "Grace", "Hannah", "Isaac", "Jack",
                "Katherine", "Liam", "Mia", "Noah", "Olivia",
                "Peter", "Quinn", "Rachel", "Samuel", "Taylor",
                "Ursula", "Victor", "Wendy", "Xander", "Yasmine",
                "Zachary"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Brown", "Davis", "Wilson",
                "Miller", "Jones", "Clark", "Thomas", "Lee",
                "Anderson", "Harris", "Martin", "White", "Walker",
                "Hall", "King", "Green", "Lewis", "Parker",
                "Young", "Turner", "Wright", "Adams", "Baker",
                "Carter", "Cook", "Evans", "Gray", "Hayes",
                "Moore", "Murphy", "Peterson", "Reed", "Ross",
                "Sanders", "Scott", "Stewart", "Taylor", "Thomas",
                "Watson", "Williams", "Wood", "Woodward", "Wright",
                "Zimmerman"
        };

        // Create a Random object to generate random indexes
        Random random = new Random();

        // Select random first and last names
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        // Combine and return the random full name
        return firstName + " " + lastName;
    }
}
