import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter numbers separated by spaces
        System.out.println("Enter a series of numbers separated by spaces:");
        String input = scanner.nextLine();

        // Split the input string into individual numbers
        String[] numbers = input.split("\\s+");

        // Convert strings to integers
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        int algorithmSelection;
        boolean validInput = false;

        // Loop until valid input (1 or 2) is provided
        do {
            System.out.println("Enter \"1\" to sort through a SelectionSort algorithm or \"2\" for QuickSort:");
            // Validate input for integers 1 or 2
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter either \"1\" or \"2\":");
                scanner.next(); // Clear the invalid input
            }
            algorithmSelection = scanner.nextInt();
            // Check if the input is within the range of 1 or 2
            if (algorithmSelection < 1 || algorithmSelection > 2) {
                System.out.println("Please enter either \"1\" or \"2\":");
            } else {
                validInput = true;
            }
        } while (!validInput);

        // Choose sorting algorithm based on user input
        switch (algorithmSelection) {
            case 1 -> {
                // Apply selection sort to sort the array
                SelectionSort.selectionSort(array);

                // Display the sorted array using SelectionSort
                System.out.println("Sorted series of numbers (using SelectionSort):");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
            case 2 -> {
                // Apply quick sort to sort the array
                QuickSort.quickSort(array, 0, array.length - 1);

                // Display the sorted array using QuickSort
                System.out.println("Sorted series of numbers (using QuickSort):");
                for (int num : array) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
