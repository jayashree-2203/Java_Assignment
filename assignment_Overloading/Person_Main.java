package assignment_Overloading;

class Person 
{
	String name;
	int age;
	String Id;
	
	Person(String name){
		this.name=name;
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	Person(String name,int age,String Id){
		this.name=name;
		this.age=age;
		this.Id=Id;
	}
	
	public void display()
	{
		System.out.println("Person1 Name:"+this.name);
	}
}

public class Person_Main 
{
	public static void main(String[] args) 
	{
		Person person1=new Person("Raj");
		Person person2=new Person("Harini",20);
		Person person3=new Person("Abi",20,"Person-1");
		
		person1.display();
		person2.display();
		person3.display();
	}
}