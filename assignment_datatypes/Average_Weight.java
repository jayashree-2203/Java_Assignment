package assignment_datatypes;

import java.util.Scanner;

public class Average_Weight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] weight=new int[10];
		int i,sum=0;
		for(i=0;i<10;i++)
		{
			sum+=sc.nextInt();
		}
		int average=sum/10;
		System.out.println(average);
	}

}
