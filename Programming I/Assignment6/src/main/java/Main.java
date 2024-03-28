import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store instances of SalesEmployee (SalesAgent and SalesPerson).
        ArrayList<SalesEmployee> salesEmployees = new ArrayList<>();

        System.out.println();

        // Generate SalesAgent and SalesPerson objects with their respective details.
        for (int i = 0; i < 5; i++) {

            Random random = new Random();
            if (random.nextBoolean()) {
                // Create a SalesAgent with a random first name, last name, and PPS number.
                SalesAgent salesAgent = new SalesAgent(
                        generateRandomName().split(" ")[0],
                        generateRandomName().split(" ")[1],
                        generateRandomPPS()
                );
                System.out.printf("Please provide the total value of sales for %s %s: ",
                        salesAgent.getFirstName(), salesAgent.getLastName()
                );
                // Read and set the sales value for the SalesAgent.
                salesAgent.sales = scanner.nextDouble();
                salesEmployees.add(salesAgent);

            } else {
                // Create a SalesPerson with a random first name, last name, and PPS number.
                SalesPerson salesPerson = new SalesPerson(
                        generateRandomName().split(" ")[0],
                        generateRandomName().split(" ")[1],
                        generateRandomPPS()
                );
                System.out.printf("Please provide the total value of sales for %s %s: ",
                        salesPerson.getFirstName(), salesPerson.getLastName()
                );
                // Read and set the sales value for the SalesPerson.
                salesPerson.sales = scanner.nextDouble();
                salesEmployees.add(salesPerson);
            }
        }

        System.out.printf("\n%-3s | %-18s | %-8s | %-12s | %-10s | %-6s",
                "ID", "Name", "PPS No.", "Type", "Total sales", "Commission"
        );
        System.out.print("\n------------------------------------------------------------------------------");
        // Iterate through the list of sales employees, calculate their commissions, and display their details.
        for (SalesEmployee e : salesEmployees) {
            e.calculateCommission(); // Calculate the commission specific to each employee type.
            System.out.print(e.toString()); // Display the details of each employee.
        }
    }

    // Method to generate a random full name by combining random first and last names
    public static String generateRandomName() {

        // Arrays of possible first and last names
        String[] firstNames = {
                "Alice", "Bob", "Charlie", "David", "Eva",
                "Frank", "Grace", "Hannah", "Isaac", "Jack",
                "Katherine", "Liam", "Mia", "Noah", "Olivia",
                "Peter", "Quinn", "Rachel", "Samuel", "Taylor",
                "Ursula", "Victor", "Wendy", "Xander", "Yasmine",
                "Zachary"
        };

        String[] lastNames = {
                "Smith", "Johnson", "Brown", "Davis", "Wilson",
                "Miller", "Jones", "Clark", "Thomas", "Lee",
                "Anderson", "Harris", "Martin", "White", "Walker",
                "Hall", "King", "Green", "Lewis", "Parker",
                "Young", "Turner", "Wright", "Adams", "Baker",
                "Carter", "Cook", "Evans", "Gray", "Hayes",
                "Moore", "Murphy", "Peterson", "Reed", "Ross",
                "Sanders", "Scott", "Stewart", "Taylor", "Thomas",
                "Watson", "Williams", "Wood", "Woodward", "Wright",
                "Zimmerman"
        };

        // Create a Random object to generate random indexes
        Random random = new Random();

        // Select random first and last names
        String firstName = firstNames[random.nextInt(firstNames.length)];
        String lastName = lastNames[random.nextInt(lastNames.length)];

        // Combine and return the random full name
        return firstName + " " + lastName;
    }

    // Method to generate a random PPS (Personal Public Service) number
    public static String generateRandomPPS() {
        Random random = new Random();
        StringBuilder pps = new StringBuilder();

        // Generate the first character as a capital letter (A-Z)
        char letter = (char) (random.nextInt(26) + 'A');
        pps.append(letter);

        // Generate the next characters as numbers (0-9)
        for (int i = 1; i < 8; i++) {
            int digit = random.nextInt(10);
            pps.append(digit);
        }

        return pps.toString();
    }
}
