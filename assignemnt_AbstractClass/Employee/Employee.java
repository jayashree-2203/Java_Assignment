package assignemnt_AbstractClass.Employee;

public abstract class Employee {
	 protected String name;
	    protected int id;

	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    public abstract double calculatePay();

	    public void getEmployeeDetails() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }
}
