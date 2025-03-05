package assignment_String;

import java.util.*;
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int i;
		String rev="";
		for(i=0;i<s.length();i++)
		{
			rev=s.charAt(i)+rev;
		}
		System.out.print(rev);
	}

}
