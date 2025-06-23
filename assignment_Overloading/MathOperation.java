package assignment_Overloading;

import java.util.*;
public class MathOperation {
	
		public static double Math(int n1,int n2){
			return n1/n2;
		}
		public static float Math(float n3,float n4){
			return n3*n4;
		}
		public static int Math(double n5,double n6){
			return (int)(n5+n6);
		}

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter values for division");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("Division: "+Math(num1,num2));
			System.out.println("Enter values for multilication");
			float num3=sc.nextFloat();
			float num4=sc.nextFloat();
			System.out.println("Multiplication: "+Math(num3,num4));
			System.out.println("Enter values for addition");
			double num5=sc.nextDouble();
			double num6=sc.nextDouble();
			System.out.println("Addition: "+Math(num5,num6));

		}

}
