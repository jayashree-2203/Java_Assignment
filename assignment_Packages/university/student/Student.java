package assignment_Packages.university.student;

public class Student {
	private String name;
	private String reg_no;
	private String department;

	public Student(String name,String reg_no,String dpartment){
		this.name=name;
		this.reg_no=reg_no;
		this.department=department;
	}
	
	public String getName(){
		return name;
	}
	
	public String getRegno(){
		return reg_no;
	}
	
	public String toString(){
		return "Name: "+name+"\nRegister No: "+reg_no+"\nDepartment: "+department;
	}
}