package assignment_scope_operators;

import java.util.*;
public class Celcius_to_Farenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int celcius=sc.nextInt();
		float val=1.8f;
		float farenheit=(celcius*val)+32;
		System.out.print(Math.round(farenheit));
	}
}
