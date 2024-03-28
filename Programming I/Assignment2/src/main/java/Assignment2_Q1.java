import java.util.Scanner;

public class Assignment2_Q1 {
    public static void main(String[] args) {

        int sizeArray;
        double[] numbers;
        double sumNumbers = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        sizeArray = sc.nextInt();
        numbers = new double[sizeArray];

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = sc.nextDouble();
        }

        for  (double n : numbers) {
            sumNumbers += n;
            System.out.println(n);
        }

        System.out.println("Sum of the array contents: " + sumNumbers);
    }
}
