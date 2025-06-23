package assignment_Inheritance;

class Student
{
	String name;
	int roll_no;
	Student(String name,int roll_no)
	{
		this.name=name;
		this.roll_no=roll_no;
	}
}
class ZSGS extends Student
{
	String branch;
	ZSGS(String name,int roll_no,String branch)
	{
		super(name,roll_no);
		this.branch=branch;
	}
	public void getBranch()
	{
		System.out.println("Branch of "+ name +" is : "+branch);
	}
}
public class Student_Main {

	public static void main(String[] args) {
		ZSGS obj1=new ZSGS("ABCD",22,"Chennai");
		ZSGS obj2=new ZSGS("JKLM",13,"Coimbatore");
		obj1.getBranch();
		obj2.getBranch();
	}
}