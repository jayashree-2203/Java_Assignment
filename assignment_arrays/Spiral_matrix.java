package assignment_arrays;

import java.util.Scanner;

public class Spiral_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,j,c=0,max_col=n,min_col=0,max_row=n,min_row=0;
		int[][] arr=new int[n][n];
		while(c<n*n)
		{
			for(i=min_col;i<max_col;i++)
			{
				arr[min_row][i]=++c;
			}
			for(i=min_row+1;i<max_row-1;i++)
			{
				arr[i][max_col-1]=++c;
			}
			for(i=max_col-1;i>min_col;i--)
			{
				arr[max_row-1][i]=++c;
			}
			for(i=max_row-1;i>min_row;i--)
			{
				arr[i][min_col]=++c;
			}
			max_col--;
			max_row--;
			min_col++;
			min_row++;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
