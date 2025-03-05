package assignment_String;

import java.util.Scanner;

public class Squeaky_Clean {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder result = new StringBuilder();
	    boolean toUpper = false;
	    for (char ch : input.toCharArray()) 
	    {
	    	if (ch == ' ') 
	    	{
	    		result.append('_');
	    	} 
	    	else if (ch == '-') 
	    	{
	    		toUpper = true;
	    	} 
	    	else if ("43017".indexOf(ch) != -1) 
	    	{
	    		result.append("aeolt".charAt("43017".indexOf(ch)));
	        } 
	    	else if (Character.isLetter(ch)) 
	    	{
	    		result.append(toUpper ? Character.toUpperCase(ch) : ch);
	    		toUpper = false;
	        }
	    }
	    System.out.print(result);
	}

}
