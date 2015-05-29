// Based on the day of the week that is input, program tells you the business hours

import java.util.Scanner;

public class DayOfWeek {
	private DaysOfTheWeek days;	
	
	enum DaysOfTheWeek {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	};

	public static void main(String[] args) {
		int d = -1;
		
		do {
		// prints out list of days of the week using for loop to loop through
		// enum
		System.out.println("Choose a day of the week to get our business hours: ");
		for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
			System.out.print(days + " ");
		}
		
		Scanner input = new Scanner(System.in);
		String day = "";
				
		// adds line
		System.out.println();
			
		// stores the input
		day = input.nextLine().toUpperCase();
		
		for (DaysOfTheWeek days : DaysOfTheWeek.values()) {
			if (day.equals(days.toString()))
				d = days.ordinal();
		} 
		
		String hours = "\nBusiness hours are from ";

		// Sunday hours
		if (d == 0) {
			System.out.println(hours + "11am to 5pm.");
		} 
		// weekday hours
		else if (d > 0 && d < 6) {
			System.out.println(hours + "9am to 9pm.");
		} 
		// Saturday hours
		else if (d == 6) {
			System.out.println(hours + "10am to 6pm.");
		} 
		// invalid day
		else {
			System.out.println("Invalid day. Please choose one of the seven days.\n");
		}
		} while (d < 0 || d > 6);
		
	}

}
