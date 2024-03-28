import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] seatsSold = new int[3];
        double[] ticketPrice = new double[3];
        double totalSales = 0;
        char ticketReference = 'A';

        System.out.println();

        for (int i = 0; i < seatsSold.length; i++) {
            System.out.printf("Enter number of %s seats sold: ", ticketReference);
            seatsSold[i] = input.nextInt();
            System.out.printf("Enter price of %s tickets: ", ticketReference++);
            ticketPrice[i] = input.nextDouble();

            totalSales += (seatsSold[i] * ticketPrice[i]);
        }

        System.out.println("\n \t \t Tickets Sold \t Price per Ticket");
        System.out.print("\t \t ------------ \t -----------------");

        ticketReference = 'A';
        for (int i = 0; i < seatsSold.length; i++) {
        System.out.printf("%n%s Tickets: \t\s %-12s \t %.2f", ticketReference++, seatsSold[i], ticketPrice[i]);
        }

        System.out.printf("%n%n\t \t Total Sales \u20ac %.2f", totalSales);
    }
}
