package assignemnt_AbstractClass.Employee;

public class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }
}