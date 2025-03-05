package assignment_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Transpose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt(),i,j;
		int arr[][]=new int[m][n];
		int res[][]=new int[n][m];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				res[i][j]=arr[j][i];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
