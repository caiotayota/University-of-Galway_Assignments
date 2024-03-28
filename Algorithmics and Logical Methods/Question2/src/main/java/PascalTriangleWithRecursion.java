import java.util.Scanner;

public class PascalTriangleWithRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt(); // Reads the number of rows for Pascal's Triangle

        printPascalTriangle(n); // Calls the method to print Pascal's Triangle

        scanner.close(); // Closing the Scanner object to free resources
    }

    // Method to print Pascal's Triangle
    public static void printPascalTriangle(int n) {
        for (int line = 0; line < n; line++) {
            printPascalLine(line, n); // Prints each line of Pascal's Triangle
            System.out.println(); // Move to the next line for the next row
        }
    }

    // Method to print each line of Pascal's Triangle
    public static void printPascalLine(int line, int n) {
        printSpaces(n - line - 1); // Prints spaces to format the triangle
        printPascalValues(line); // Prints the values for each line
    }

    // Method to print spaces
    public static void printSpaces(int count) {
        if (count > 0) {
            System.out.print("  "); // Prints a space
            printSpaces(count - 1); // Recursively prints spaces
        }
    }

    // Method to print Pascal's Triangle values for each line
    public static void printPascalValues(int line) {
        for (int i = 0; i <= line; i++) {
            System.out.printf("%4d", calculatePascalValue(line, i)); // Prints each value with spacing
        }
    }

    // Recursive method to calculate Pascal's Triangle values
    public static int calculatePascalValue(int row, int col) {
        if (col == 0 || col == row) {
            return 1; // Base case: first and last values in a row are always 1
        } else {
            // Calculates values based on the sum of the values from the row above
            return calculatePascalValue(row - 1, col - 1) + calculatePascalValue(row - 1, col);
        }
    }
}
