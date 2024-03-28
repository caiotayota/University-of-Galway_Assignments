// This is a concrete class named SalesAgent that extends the SalesEmployee class.
public class SalesAgent extends SalesEmployee {

    // Default constructor for SalesAgent, with no arguments.
    public SalesAgent() {

    }

    // Parameterized constructor for SalesAgent, which takes first name, last name, and PPS number and passes them to the base class constructor.
    public SalesAgent(String firstName, String lastName, String ppsNumber) {
        super(firstName, lastName, ppsNumber);
    }

    // Override the abstract calculateCommission method from the base class to calculate the commission for a SalesAgent.
    @Override
    void calculateCommission() {
        // Commission is calculated as 10% (0.1) of the total sales made by the SalesAgent.
        commission = sales * 0.1;
    }
}
