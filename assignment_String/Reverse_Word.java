package assignment_String;

import java.util.Scanner;

public class Reverse_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(reverse(s));
	}
	static String reverse(String s)
	{
		if(!s.contains(" "))
		{
			return s+" ";
		}
		int index=s.indexOf(" ");
		String a=s.substring(0,index)+" ";
		return reverse(s.substring(index+1))+a;
	}
}
