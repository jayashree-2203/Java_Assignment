package assignment_conditional_unconditional;

import java.util.Scanner;

public class Second_Occurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int element=sc.nextInt(),count=0,index=-1;
		for(i=0;i<n;i++)
		{
			if(a[i]==element)
			{
				count++;
				if(count==2)
				{
					index=i+1;
					break;
				}
			}
		}
		System.out.print(index);
	}

}
