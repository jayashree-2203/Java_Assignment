package assignment_conditional_unconditional;

import java.util.Scanner;

public class Greatest_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("Greatest number is "+(a>b && b>c?a:b>c?b:c));

	}

}
