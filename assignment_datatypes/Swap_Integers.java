package assignment_datatypes;

public class Swap_Integers {

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}
	static void method1()
	{
		int a,b,c;
		a=10;
		b=15;
		c=a;
		a=b;
		b=c;
		System.out.println("a="+a+" b="+b);
	}
	static void method2()
	{
		int a,b,c;
		a=10;
		b=15;
		c=a+b;
		a=c-a;
		b=c-b;
		System.out.println("a="+a+" b="+b);
	}
	static void method3()
	{
		int a,b,c;
		a=10;
		b=15;
		c=a*b;
		a=c/a;
		b=c/b;
		System.out.println("a="+a+" b="+b);
	}
}
