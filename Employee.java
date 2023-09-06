package java_basic;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void applyRaise(double percentage) {
        if (percentage > 0) {
            monthlySalary += monthlySalary * (percentage / 100);
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 5000.0);
        Employee emp2 = new Employee("Jane", "Smith", 6000.0);

        System.out.println("Employee 1's Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2's Yearly Salary: " + emp2.getYearlySalary());

        emp1.applyRaise(10);
        emp2.applyRaise(10);

        System.out.println("\nAfter 10% Raise:");

        System.out.println("Employee 1's Yearly Salary: " + emp1.getYearlySalary());
        System.out.println("Employee 2's Yearly Salary: " + emp2.getYearlySalary());
    }
}

