// PostGraduate is a subclass of the Student class, inheriting its fields and methods.
public class PostGraduate extends Student {

    // Default constructor
    public PostGraduate() {
    }

    // Parameterized constructor that takes the name and ID
    public PostGraduate(String name, long id) {
        // Call the constructor of the superclass (Student) with the name and ID
        super(name, id);
    }

    // Override the calculateResult method to calculate the result based on specific criteria
    @Override
    public void calculateResult() {
        // Calculate the result as the average of test scores
        int result = (getTestScore(0) + getTestScore(1) + getTestScore(2)) / getNumTests();

        // Set the grade based on whether the result is greater than or equal to 50
        setGrade(result >= 50 ? "Pass" : "Fail");
    }
}
