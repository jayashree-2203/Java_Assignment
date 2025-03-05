package assignment_conditional_unconditional;

import java.util.Scanner;

public class Sum_of_Even_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),i,sum=0;
		for(i=0;i<n;i++)
		{
			int s=sc.nextInt();
			if(s%2!=0)
			{
				continue;
			}
			sum+=s;
		}
		System.out.print(sum);
	}

}
