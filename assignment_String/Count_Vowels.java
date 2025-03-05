package assignment_String;

import java.util.Scanner;

public class Count_Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i,count=0;
		for(i=0;i<s.length();i++)
		{
			if(isvowel(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.print(count);
	}
	static boolean isvowel(char ch)
	{
		return "AEIOUaeiou".indexOf(ch)!=-1;
	}
}
