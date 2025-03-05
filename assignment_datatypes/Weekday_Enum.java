package assignment_datatypes;

import java.util.Scanner;

public class Weekday_Enum {
	enum WeekDays{
		Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt();
		System.out.print(WeekDays.values()[day-1]);
	}

}
