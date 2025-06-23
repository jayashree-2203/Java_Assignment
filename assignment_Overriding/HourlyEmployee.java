package assignment_Overriding;

public class HourlyEmployee extends Employee{
	double hourlysalary;
	double totalhours;
	
	public HourlyEmployee(String name,String empid,String department,double hourlysalary,double totalhours){
		super(name,empid,department);
		this.hourlysalary=hourlysalary;
		this.totalhours=totalhours;
	}
	
	public String getEmployeeDetails(){
		return "HourlyEmployee: "+super.getEmployeeDetails()+
				"\nHourlySalary:"+hourlysalary+"\nTotalhours: "+totalhours+"\n";
	}
}