// Prompts user for what type of coffee they want until they choose Quit or choose all 3 types of coffee
// Then the program outputs the user's total

import java.util.Scanner;

public class Coffee {

	public static void main(String[] args) {
		final int QUIT = 0;
		final int AMERICAN = 1;
		final int ESPRESSO = 2;
		final int LATTE = 3;
		double total = 0;
		int choice;
		int numSelections = 0;
		String ty = "Thank you for your order of ";

		Scanner input = new Scanner(System.in);
		do {			
		System.out.println("Would you like 1) American, 2) Espresso, 3) Latte, or 0) quit?");
		choice = input.nextInt();
		numSelections++;
		switch (choice) {
			case(AMERICAN):
				total += 1.99;
				System.out.println(ty + "American coffee.");
				break;
			case(ESPRESSO):
				total += 2.50;
				System.out.println(ty + "Espresso coffee.");
				break;
			case(LATTE):
				total += 2.15;
				System.out.println(ty + "Latte coffee.");
				break;
			case(QUIT):
				break;
			default:
				System.out.println("That menu option is not available.");
			}
		} while (choice != 0 && numSelections < 3);
		
		System.out.println("Thank you. Your total is $" + total + ".");

	}

}
