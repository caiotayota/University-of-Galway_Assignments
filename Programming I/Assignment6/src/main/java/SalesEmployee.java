// This is an abstract class called SalesEmployee, which serves as a base class for sales-related employees.
public abstract class SalesEmployee {
    // Private instance variables to store employee information.
    private String firstName;
    private String lastName;
    private static int bikeEmployeeNumber = 0; // Static variable to track the total number of employees.
    private String ppsNumber;
    protected double sales; // Protected variables to store sales and commission details.
    protected double commission;
    private int employeeNumber; // Employee-specific unique identifier.

    // Default constructor for SalesEmployee, no arguments.
    public SalesEmployee() {
        employeeNumber = bikeEmployeeNumber++;
    }

    // Parameterized constructor for SalesEmployee, taking first name, last name, and PPS (Personal Public Service) number.
    public SalesEmployee(String firstName, String lastName, String ppsNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ppsNumber = ppsNumber;
        employeeNumber = bikeEmployeeNumber++;
    }

    // Getter methods to retrieve private fields.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPPS() {
        return ppsNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    // Setter methods to update the first name, last name, and PPS number.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPPS(String ppsNumber) {
        this.ppsNumber = ppsNumber;
    }

    // Override the toString() method to provide a string representation of the SalesEmployee.
    @Override
    public String toString() {
        System.out.println();

        String employeeType = (this instanceof SalesAgent) ? "Sales Agent" : "Sales Person";
        String employeeName = firstName + " " + lastName;

        return String.format(" %-2s | %-18s | %-8s | %-12s | \u20AC%-10.2f | \u20AC%.2f",
                employeeNumber, employeeName, ppsNumber, employeeType, sales, commission);
    }

    // Abstract method to calculate commission, which is specific to subclasses and must be implemented in derived classes.
    abstract void calculateCommission();
}
