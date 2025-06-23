package assignment_Overriding;

public class Main {

	public static void main(String[] args) 
	{
			Employee emp1=new HourlyEmployee("Anu","22","Developer",50.0,150.0);
			Employee emp2=new SalariedEmployee("Akash","14","Testing",50000);
			System.out.println(emp1.getEmployeeDetails());
			System.out.println(emp2.getEmployeeDetails());

	}
}