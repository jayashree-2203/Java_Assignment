package assignment_Class_Objects;
class Employee_details{
	  private int id;
	  private String name;
	  private String department;
	  private double salary;

	  private static int totalEmployees = 0;

	  public Employee_details(String name, String department, double salary){
	    this.name = name;
	    this.department = department;
	    this.salary = salary;
	    totalEmployees++;
	    this.id=totalEmployees;
	  }
	  public void setId(int id){
	    this.id = id;
	  }
	  public int getId(){
	    return id;
	  }
	  public void setName(String name){
	    this.name = name;
	  }
	  public String getName(){
	    return name;
	  }
	  public void setDepartment(String department){
	    this.department = department;
	  }
	  public String getDepartment(){
	    return department;
	  }
	  public void setSalary(double salary){
	    this.salary = salary;
	  }
	  public double getSalary(){
	    return salary;
	  }
	  public int getTotalEmployees(){
	    return totalEmployees;
	  }
	  public String toString()
	  {
		  return this.id+"\n"+this.name+"\n"+this.department+" "+this.salary;
	  }
	} 
	public class Employee {
	  public static void main(String[] args) {
	    Employee_details e1 = new Employee_details("A", "IT", 75000);
	    Employee_details e2 = new Employee_details("B", "HR", 60000);
	    System.out.println(e1.toString());
	    System.out.println(e2.toString());
	  }
	}
