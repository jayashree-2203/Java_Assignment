package assignment_String;

import java.util.*;
public class Capitalize_First_Word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
        String res="";
        for (String i:arr)
        {
        	res+=(Character.toUpperCase(i.charAt(0)));
        	res+=(i.substring(1));
        	res+=(" ");
        }
        System.out.print(res);
	}
}