package assignment_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt(),i,temp;
		int[] arr=new int[size];
		int[] result=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		for(i=0;i<size;i++)
		{
			result[(i+n)%size]=arr[i];
		}
		System.out.print(Arrays.toString(result));
	}

}
