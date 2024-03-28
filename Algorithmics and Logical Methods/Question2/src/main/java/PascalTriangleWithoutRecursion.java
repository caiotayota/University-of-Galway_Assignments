import java.util.Scanner;

public class PascalTriangleWithoutRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int n = scanner.nextInt(); // Reads the number of rows for Pascal's Triangle

        // Loop to iterate through each row
        for (int i = 0; i < n; i++) {
            int number = 1;

            // Printing spaces to create a triangular shape
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // Loop to calculate and print values in each row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number); // Printing each number with spacing
                number = number * (i - j) / (j + 1); // Calculating the next number based on the current number
            }
            System.out.println(); // Move to the next line for the next row
        }
        scanner.close(); // Closing the Scanner object to free resources
    }
}
