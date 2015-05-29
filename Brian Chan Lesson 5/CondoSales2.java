// Allows user to choose between different options for a condo, and outputs the price at the end

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CondoSales2 {

	public static void main(String[] args) {
		int viewChoice;
		int price;
		String view;
		final int PARK_VIEW = 1;
		final int GOLF_COURSE_VIEW = 2;
		final int LAKE_VIEW = 3;
		final String PARK = "park view";
		final String GOLF_COURSE = "golf course view";
		final String LAKE = "lake view";

		Scanner input = new Scanner(System.in);
		// park, golf course, or lake view?
		System.out.println("Choose a condo with " + PARK_VIEW + ") " + PARK + ", " + GOLF_COURSE_VIEW + ") " + GOLF_COURSE + ", or " + LAKE_VIEW	+ ") " + LAKE + ".");
		viewChoice = input.nextInt();

		switch (viewChoice) {
		case (PARK_VIEW):
			view = PARK;
			price = 150000;
			break;
		case (GOLF_COURSE_VIEW):
			view = GOLF_COURSE;
			price = 170000;
			break;
		case (LAKE_VIEW):
			view = LAKE;
			price = 210000;
			break;
		default:
			view = "invalid";
			price = 0;
		}

		// granite countertops?
		String countertopsOrNot = "No granite countertops will be added. ";
		if (viewChoice >= PARK_VIEW && viewChoice <= LAKE_VIEW) {
			System.out.println("Would you like granite counter tops in the kitchen? 1) Yes 2) No");
			int countertops = input.nextInt();
			
			switch (countertops) {
			case 1: // granite
				price += 4000;
				countertopsOrNot = "Granite counter tops will be added. ";
				System.out.println(countertopsOrNot	+ " $4000 will be added to the price.");
				break;
			case 2: // no granite
				System.out.println(countertopsOrNot);
				break;
			default: // invalid
				System.out.println(countertopsOrNot);
			}
		}

		// garage or parking space?
		String garageYesNo = "You will get a parking space. ";
		String expeditedOrNot = "Construction will not be expedited. ";
		if (viewChoice >= PARK_VIEW && viewChoice <= LAKE_VIEW) {
			System.out.println("Would you like a 1) garage or 2) parking space?");
			int garageOrNot = input.nextInt();

			switch (garageOrNot) {
			case 1: // garage
				price += 5000;
				garageYesNo = "You will get a garage. ";
				System.out.println(garageYesNo + " $5000 will be added to the price.");
				break;
			case 2: // parking space
				System.out.println(garageYesNo);
				break;
			default: // input not recognized
				System.out.println("Input not recognized. " + garageYesNo);
			}

			// expedited construction?
			System.out.println("Does construction need to be expedited? 1) Yes 2) No");
			int expedited = input.nextInt();

			switch (expedited) {
			case 1: // expedited
				price += 2000;
				expeditedOrNot = "Construction will be expedited. ";
				System.out.println(expeditedOrNot + " $2000 will be added to the price.");
				break;
			case 2: // not expedited
				System.out.println(expeditedOrNot);
				break;
			default:
				System.out.println(expeditedOrNot);
			}
		}

		System.out.println("\nYou have chosen the condo with the " + view + " for $" + price	+ ".\n" + countertopsOrNot + garageYesNo + expeditedOrNot);

	}
}
