package assignment_scope_operators;

import java.util.Scanner;

public class Bitwise_Operation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("AND: "+(x&y));
		System.out.println("OR: "+(x|y));
		System.out.println("XOR: "+(x^y));
		System.out.println("Right shift: "+(x>>y));
		System.out.println("LEFT shift: "+(x<<y));
	}
}
