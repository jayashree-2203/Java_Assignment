package assignment_Overriding;

public class Employee {
	String name;
	String empid;
	String department;
	
	public Employee(String name,String empid,String department){
		this.name=name;
		this.empid=empid;
		this.department=department;
	}
	
	public String getEmployeeDetails(){
		return "\nName: "+name+"\nId: "+empid+"\nDepartment:"+department;
	}
}
