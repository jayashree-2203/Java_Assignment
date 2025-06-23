package assignemnt_ExceptionHandling;

import java.util.*;
public class PhoneNumberValidation {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try 
        {
            System.out.print("Enter your 10-digit phone number: ");
            long phoneNumber = sc.nextLong();
            if(phoneNumber>5999999999L && phoneNumber<10000000000L)
            	System.out.println("Phone number accepted: " + phoneNumber);
            else
            	throw new InputMismatchException();
        } 
        catch (InputMismatchException e) 
        {
            System.out.println("Invalid input! Please enter valid phone number.");
        } 
            sc.close();
    }
}
