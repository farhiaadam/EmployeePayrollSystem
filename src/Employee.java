public abstract class Employee {
    public  int employeeId;
    public double salary;

    public Employee(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
    }
}
