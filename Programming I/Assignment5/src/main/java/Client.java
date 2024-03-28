import java.util.Scanner; // Import statement to use the Scanner class for input.

public class Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input.
        Student[] students = new Student[3]; // Create an array to store student objects.

        for (int i = 0; i < 3; i++) {
            // Input student name and ID from the user.
            System.out.print("\nEnter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter student ID: ");
            int id = sc.nextInt();

            // Create UnderGraduate or PostGraduate objects based on the index.
            if (i < 2) {
                students[i] = new UnderGraduate(name, id);
            } else {
                students[i] = new PostGraduate(name, id);
            }

            for (int j = 0; j < 3; j++) {
                // Input and validate exam results for each student.
                System.out.print("Enter exam result no." + (j + 1) + ":");
                int examResult = sc.nextInt();

                if (examResult > 100 || examResult < 0) {
                    // If the exam result is out of the valid range, prompt the user to enter a valid result.
                    while (examResult > 100 || examResult < 0) {
                        System.out.println("* Exam result must be in a range between 0 to 100 *");
                        System.out.print("Enter exam result no." + (j + 1) + ": ");
                        examResult = sc.nextInt();
                    }
                }

                // Set the exam result for the current student.
                students[i].setTestScore(j, examResult);
            }

            sc.nextLine(); // Consume the newline character left in the input buffer.

            // Calculate and print the result for the current student.
            students[i].calculateResult();
        }

        System.out.println();

        // Display the information for all the students.
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
