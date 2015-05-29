// Calculates the babysitting fee 
// (based on the chosen babysitter, number of children, number of hours, and whether diaper changing is required)

import java.util.Scanner;

public class BabysittingJob {
	int jobNumber;
	int code;
	String name;
	int numChildren;
	int numHours;
	int fee;
	boolean diaperChanging;
	
	public BabysittingJob(int jobNumber, int code, int numChildren, int numHours, boolean diaperChanging) {
		switch(code) {
		case 1: name = "Cindy"; 
			fee = numChildren * numHours * 7;
			break;
		case 2: name = "Greg"; break;
		case 3: name = "Marcia"; 
		}
		
		if (code > 1) {
			fee = numHours * (9 + 4 * (numChildren - 1));
		}
		
		if (diaperChanging) {
			fee += 20;
		}
		
		this.jobNumber = jobNumber;
		this.code = code;
		this.numChildren = numChildren;
		this.numHours = numHours;
		this.diaperChanging = diaperChanging;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Job number: " + jobNumber);
		System.out.println("Babysitter code: " + code);
		System.out.println("Babysitter: " + name);
		System.out.println("Number of children: " + numChildren);
		System.out.println("Number of hours: " + numHours);
		System.out.println("Requires diaper changing: " + diaperChanging);
		System.out.println("Fee: $" + fee);
	}

	public static void main(String[] args) {
		int year;
		int jobNumber;
		int code;
		int children;
		int hours;
		int diapers;
		boolean diaperChanging = false;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter a year (2013-25): ");
			year = input.nextInt();
		} while (year < 2013 || year > 2025);
		
		do {
			System.out.println("Enter a job number (1-9999): ");
			jobNumber = input.nextInt();
		} while (jobNumber < 1 || jobNumber > 9999);
		
		do {
			System.out.println("Enter a babysitter code (1-3): ");
			code = input.nextInt();
		} while (code < 1 || code > 3);
		
		do {
			System.out.println("Number of children (1-9): ");
			children = input.nextInt();
		} while (children < 1 || children > 9);
		
		do {
			System.out.println("Number of hours (1-12): ");
			hours = input.nextInt();
		} while (hours < 1 || hours > 12);
		
		do {
			System.out.println("Is diaper changing required? 1) Yes 2) No");
			diapers = input.nextInt();
		} while (diapers < 1 || diapers > 2);
		
		if (diapers == 1) {
			diaperChanging = true;
		} 
		
		int lastTwoDigits = year % 100;
		String jobNumberTemp = String.format("%04d", jobNumber); // adds leading zeros so number occupies 4 digits
		String jobNum = lastTwoDigits + "" + jobNumberTemp; // concatenate integers
		int job = Integer.parseInt(jobNum); // convert String to integer

		BabysittingJob newJob = new BabysittingJob(job, code, children, hours, diaperChanging);
		newJob.display();
	}

}
