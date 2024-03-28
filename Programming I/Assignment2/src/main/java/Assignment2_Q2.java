import java.util.Scanner;

public class Assignment2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        boolean firstCondition = year % 4 == 0 && year % 100 != 0;
        boolean secondCondition = year % 4 == 0 && year % 100 == 0 && year % 400 == 0;

        String result = firstCondition || secondCondition ? "Leap Year" : "Not a Leap Year";

        System.out.println(result);
    }
}
