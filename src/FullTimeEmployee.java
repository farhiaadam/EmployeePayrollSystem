public class FullTimeEmployee extends Employee implements Taxable, BonusEligible {

    public FullTimeEmployee(int employeeId, double salary) {
        super(employeeId, salary);
    }

    @Override
    public double calculateSalary() {
        return salary + calculateBonus() - calculateTax();
    }

    @Override
    public double calculateTax() {
        return salary * 0.3;
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }
}
