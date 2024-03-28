// Import the Scanner class to read input from the user
import java.util.Scanner;

// Define a class named Assignment3
public class Assignment3 {
    // The main method where the program execution starts
    public static void main(String[] args) {

        // Initialize a boolean variable 'exit' to control the loop
        boolean exit = false;

        // Create a Scanner object 'sc' to read user input from the console
        Scanner sc = new Scanner(System.in);

        // Display a message explaining the purpose of the program
        System.out.println("\nThis program counts the number of digits in an integer entered by the user. \n Enter -1 to exit");

        // Start a loop that continues until 'exit' becomes true
        while (!exit) {
            // Prompt the user to enter a number
            System.out.print("\nEnter Number: ");

            // Read an integer input from the user
            int input = sc.nextInt();

            // Check if the user entered -1 to exit the program
            if (input == -1) {
                // Display a message indicating program termination
                System.out.println("Program Terminated ...");

                // Set 'exit' to true to exit the loop
                exit = true;
            } else {
                // Calculate the number of digits in the input by converting it to a string
                int digits = String.valueOf(input).length();

                // Display the number of digits in the input
                System.out.println("Number of digits in " + input + " is " + digits);
            }
        }

        // Close the Scanner object to release resources
        sc.close();
    }
}
