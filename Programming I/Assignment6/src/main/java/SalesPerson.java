// This is a concrete class named SalesPerson that extends the SalesEmployee class.
public class SalesPerson extends SalesEmployee {

    // Default constructor for SalesPerson, with no arguments.
    public SalesPerson() {
    }

    // Parameterized constructor for SalesPerson, which takes first name, last name, and PPS number and passes them to the base class constructor.
    public SalesPerson(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Override the abstract calculateCommission method from the base class to calculate the commission for a SalesPerson.
    @Override
    void calculateCommission() {
        // Commission is calculated as 15% (0.15) of the total sales made by the SalesPerson.
        commission = sales * 0.15;
    }
}
