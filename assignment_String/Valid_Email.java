package assignment_String;

import java.util.Scanner;

public class Valid_Email {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(validEmail(s));
	}
	static boolean validEmail(String s)
	{
		int i,a=0;
		boolean bool=true;
		int index_at=s.indexOf("@");
		if(index_at==-1 || index_at==0 || index_at==s.length()-1)
		{
			return false;
		}
		int index_dot = s.substring(index_at+1).indexOf(".");
		if (index_dot == -1 || index_dot == s.length() - 1 || index_dot==0) {
            return false;
        }
        int index_dot2 = s.substring(index_at+index_dot+2).indexOf(".");
        //System.out.println(index_at+" "+index_dot+" "+index_dot2);
        if(index_dot2!=-1)
        {
        	return false;
        }
        return true;
	}
}
