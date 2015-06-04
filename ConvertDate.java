// Takes in date in mm/dd/yyyy format and spells it out
// Outputs ordinal position (# days since the beginning of the year)

import java.util.*;

public class ConvertDate {
	public static void main(String[] args) {
		int i;
		int month = 0;
		int day = 0;
		int year = 0;
		String monthAndYear = new String();
		int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter a date (mm/dd/yyyy):");
			String date = input.nextLine();

			for (i = 0; i < date.length(); i++) {
				if (date.substring(i, i + 1).equals("/")) {
					// get month
					month = Integer.parseInt(date.substring(0, i));
					monthAndYear = date.substring(i + 1, date.length());
					for (i = 0; i < monthAndYear.length(); i++) {
						if (monthAndYear.substring(i, i + 1).equals("/")) {
							// get day
							day = Integer.parseInt(monthAndYear.substring(0, i));
							// get year
							year = Integer.parseInt(monthAndYear.substring(i + 1, monthAndYear.length()));
							// leap year
							if (month==2 && year%4==0 && year%100!=0) {
								daysInMonth[1] = 29;
								if (year%400 == 0) {
									daysInMonth[1] = 29;
								}
							}
							
						}
					}
				}
			}
		} while (month < 1 || month > 12 || day < 1 || day > daysInMonth[month-1]); // day cannot be greater than the total number of days in the month
		input.close();
		
		// if year is 2 digits
		if (year < 100) {
			String yearString = "20" + year;
			year = Integer.parseInt(yearString);
			if (year < 10) {
				yearString = "200" + year;
				year = Integer.parseInt(yearString);
			}
		}
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		month--;
		System.out.println("\n" + months[month] + " " + day + ", " + year);
		GregorianCalendar thisDay = new GregorianCalendar(year, month, day);
		System.out.println("Ordinal position: " + thisDay.get(Calendar.DAY_OF_YEAR));

	}
}
