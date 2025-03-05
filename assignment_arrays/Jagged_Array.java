package assignment_arrays;

import java.util.Scanner;

public class Jagged_Array {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of Person");
		int n=sc.nextInt(),i,j;
		int[][] arr=new int[n][];
		for(i=0;i<n;i++)
		{
			System.out.println("Enter size for "+(i+1)+" Person");
			int m=sc.nextInt();
			arr[i]=new int[m];
			for(j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter weight to add");
				arr[i][j]=sc.nextInt();
			}
		}
		outerLoop:
		while(true)
		{
			System.out.println("Enter\n1.Find Minimum weight2.Break");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter person to calculate minimum");
				int pers=sc.nextInt();
				minimum(arr,pers);
				break;
			default:
				break outerLoop;
			}
		}
	}
	static void minimum(int arr[][],int pers)
	{
		int i,min=arr[pers-1][0];
		for(i=0;i<arr[pers-1].length;i++)
		{
			if(arr[pers-1][i]<min)
			{
				min=arr[pers-1][i];
			}
		}
		System.out.println("Minimum is "+min);
	}
}