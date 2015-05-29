// Based on course name, program outputs when the course is held
// Course name and time are stored in 2D array of strings

import java.util.Scanner;


public class Schedule {

	public static void main(String[] args) {
		// array of courses and times
		String[][] courses = {
				{"CIS 110", "Th 3:30p"},
				{"COMM 101", "M 12p"},
				{"SOC 203", "F 8a"},
				{"HIST 145", "W 5p"},
				{"MATH 309", "T 10:30"} 	};
		
		// will be used to track if course is found
		boolean found = false;
		
		do {
			// prompts user to type the name of a course, and stores it in course name
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a course (case-sensitive): ");
			String courseName = input.nextLine();
						
			for (int row = 0; row < courses.length; row++) {
				// loops through course names to find a match
				if (courseName.equals(courses[row][0])) {
					// displays course name (position 0 column) and week and time (position 1 column) the course is held
					System.out.println("\n" + courses[row][0] + " is held weekly at " + courses[row][1] + ".");
					// indicates course has been found
					found = true;
				} 
			}
			
			// if course is not found
			if (!found) {
				// error message
					System.out.println("Error: course does not exist.\n");
				}
		} while (!found); // allows user to enter a course number again until they find a course
	}
}
