// Asks user for a number from 1-1000 and generates random number from 1-1000 (computer's number)
// Prompts user to keep guessing the computer's number, letting the user know whether they are too high or low
// When the user finally guesses the computer's number, the program outputs the number of attempts it took for the user to guess the computer's number.

import java.util.Scanner;

public class RandomGuess3 {

	public static void main(String[] args) {
		// initializes guess variable and computer generated number
		// int i = 0; // for debugging
		int guess = 0;
		int computerGenerated = 0;
		boolean guessed = false;
		computerGenerated = 1 + (int) (Math.random() * 1000);
		int attempts = 0;
		Scanner input = new Scanner(System.in);

		do {
			// System.out.println(computerGenerated); // for debugging
			// prompts user to guess number
			System.out.print("Think of a number between 1 and 1000: ");
			guess = input.nextInt();
			attempts++; // keeps track of number of attempts it takes to guess the right number

			// confirms if guess is valid
			if (guess > 0 && guess < 1001) {
				do {
					// if guess is greater than computer generated number
					if (guess > computerGenerated) {
						// outputs "guessed too high"
						System.out.println("You guessed too high!\n");
					}
					// if guess is less than computer generated number
					else if (guess < computerGenerated) {
						// outputs "guessed too low"
						System.out.println("You guessed too low!\n");
					}
					// if guess is equal to computer generated number
					else {
						int answer = 0; // initialize answer
						do {
							System.out.println( "\nYou guessed it!\nNumber of attempts: " + attempts + ".\n"); // congrats! + # attempts
							// asks if user wants to play again
							
							System.out.print("Do you want to play again? 1) Yes 2) No: ");
							answer = input.nextInt(); // takes in answer in integer form
							// if yes
							if (answer == 1) {
								attempts = 0; // resets attempts to 0
								// generates new number
								computerGenerated = 1 + (int) (Math.random() * 1000);
								System.out.println();
								// System.out.println(computerGenerated); // for debugging
							}
							// if no
							else if (answer == 2) {
								System.out.println("\nThanks for playing!"); // this thanks the user for playing
								guessed = true; // guessed is true to take user out of loop
							} else {
								// if answer is invalid
								System.out.println("Invalid answer. Please answer yes or no.");
							}
						} while (answer < 1 || answer > 2); // keeps looping until yes/no answer
					}
					
					if (!guessed) {
						System.out.print("Think of another number between 1 and 1000: ");
						guess = input.nextInt();
						attempts++; // keeps track of number of attempts
						// i++; System.out.println("No invalid dialog: " + i); // for debugging
						 
						while (guess < 1 || guess > 1000) {
							System.out.print("Invalid number.\n\nThink of another number between 1 and 1000: ");
							guess = input.nextInt();
							attempts++; // keeps track of number of attempts
							// int j = 0; j++; System.out.println("Invalid dialog: " + i); // for debugging
						}		
					} 

				} while (!guessed);

			} else {
				// tells user they entered invalid number
				System.out.println("Invalid number. Please guess a number between 1 and 1000.\n");
				
			}
		} while (guess < 1 || guess > 1000); // keeps looping if number has not been guessed yet

	}
}
