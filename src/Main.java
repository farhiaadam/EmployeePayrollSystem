//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FullTimeEmployee fullTime = new FullTimeEmployee(101, 5000);

    System.out.println("Full-Time Employee:");
    fullTime.displayInfo();
    System.out.println("Net Salary: " + fullTime.calculateSalary());

    System.out.println();

    PartTimeEmployee partTime = new PartTimeEmployee(102, 80, 20);

    System.out.println("Part-Time Employee:");
    partTime.displayInfo();
    System.out.println("Net Salary: " + partTime.calculateSalary());
}
