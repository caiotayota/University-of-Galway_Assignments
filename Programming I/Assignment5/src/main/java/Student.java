import java.util.Arrays;

public class Student {
    // Class fields
    String name;            // Student's name
    long id;                // Student's ID
    String grade;           // Student's grade
    int[] test = new int[3]; // Array to store test scores
    final int NUM_TESTS = 3; // Constant for the number of tests

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for ID
    public void setId(long id) {
        this.id = id;
    }

    // Setter method for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Setter method for test scores
    public void setTestScore(int test, int grade) {
        this.test[test] = grade;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Getter method for ID
    public long getId() {
        return id;
    }

    // Getter method for grade
    public String getGrade() {
        return grade;
    }

    // Getter method for a specific test score
    public int getTestScore(int test) {
        return this.test[test];
    }

    // Getter method for the number of tests
    public int getNumTests() {
        return NUM_TESTS;
    }

    // Override toString method to display student information
    @Override
    public String toString() {
        return "Name: " + name +
                ", ID: " + id +
                ", Grade: " + grade;
    }

    // Method to calculate and print the average test score
    public void calculateResult() {
        int result = (getTestScore(0) + getTestScore(1) + getTestScore(2)) / getNumTests();
        System.out.println(result);
    }
}
