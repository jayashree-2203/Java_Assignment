package assignment_conditional_unconditional;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		switch(mark/10)
		{
		case 9,10:
			System.out.print("O");
			break;
		case 8:
			System.out.print("A");
			break;
		case 7:
			System.out.print("B");
			break;
		case 6:
			System.out.print("C");
			break;
		case 5:
			System.out.print("D");
			break;
		default:
			System.out.print("E");
			break;
		}

	}

}
