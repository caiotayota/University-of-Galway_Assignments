// UnderGraduate is a subclass of the Student class, inheriting its fields and methods.
public class UnderGraduate extends Student {

    // Default constructor
    public UnderGraduate() {
    }

    // Parameterized constructor that takes the name and ID
    public UnderGraduate(String name, long id) {
        // Call the constructor of the superclass (Student) with the name and ID
        super(name, id);
    }

    // Override the calculateResult method to calculate the result based on specific criteria
    @Override
    public void calculateResult() {
        // Calculate the result as the average of test scores
        int result = (getTestScore(0) + getTestScore(1) + getTestScore(2)) / getNumTests();

        // Set the grade based on whether the result is greater than or equal to 40
        setGrade(result >= 40 ? "Pass" : "Fail");
    }
}
