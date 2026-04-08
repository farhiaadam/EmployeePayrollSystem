public class PartTimeEmployee extends Employee implements Taxable {

    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, int hoursWorked, double hourlyRate) {
        super(employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        salary = hoursWorked * hourlyRate;
        return salary - calculateTax();
    }

    @Override
    public double calculateTax() {
        return salary * 0.2;
    }
}
