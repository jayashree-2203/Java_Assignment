package assignment_arrays;

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j;
		int arr1[][]=new int[n][n];
		int arr2[][]=new int[n][n];
		int res[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				res[i][j]=arr1[i][j]*arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
