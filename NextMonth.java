// Based on today's date, program outputs the number of days left until the first day of next month

import java.util.*;

public class NextMonth {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		// gets today's day of year 
		int today = now.get(Calendar.DAY_OF_YEAR);
		
		// gets today's year
		int year = now.get(Calendar.YEAR);
		
		// gets next month
		int month = now.get(Calendar.MONTH) + 1;
		
		// gets first day of next month in Gregorian Calendar
		GregorianCalendar firstDayOfNextMonth = new GregorianCalendar(year, month, 0);
		// gets day of year of the first day of next month
		int firstDayNextMonth = firstDayOfNextMonth.get(Calendar.DAY_OF_YEAR);
			
		// day of year for first day of next month - today's day of year 
		int daysLeftUntilNextMonth = firstDayNextMonth - today;
		
		// prints out days left until the first day of next month
		System.out.println("Days left until the first day of next month: " + daysLeftUntilNextMonth + " days");

	}

}
