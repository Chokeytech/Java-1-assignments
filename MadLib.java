// Mad Libs: asks user for words (parts of speech) and places these words into Mad Lib

import javax.swing.JOptionPane;

public class MadLib {

	public static void main(String[] args) {
		// will track whether player wants to play again
		boolean playAgain = false;
		
		do {
			// prompts user to enter words
			String adjective1 = JOptionPane.showInputDialog(null, "Enter an adjective:");
			String adjective2 = JOptionPane.showInputDialog(null, "Enter another adjective:");
			String color = JOptionPane.showInputDialog(null, "Enter a color:");
			String verb = JOptionPane.showInputDialog(null, "Enter a verb:");
			String adjective3 = JOptionPane.showInputDialog(null, "Enter another adjective:");
			String vegetable = JOptionPane.showInputDialog(null, "Enter a vegetable:");
			String exclamation = JOptionPane.showInputDialog(null, "Enter an exclamation:");
			// capitalizes exclamation b/c it is the first word of the sentence
			exclamation = exclamation.substring(0, 1).toUpperCase() + exclamation.substring(1, exclamation.length());
			String verb2 = JOptionPane.showInputDialog(null, "Enter an -ing verb:");
			
			// outputs Mad Libs w/ user words filled in the blanks
			JOptionPane.showMessageDialog(null, "Let's build a snowman! First we need to have a really " + adjective1 + " snowstorm, of course on a " + 
			adjective2 + " day.\nWatching all that " + color + " snow fall makes me want to " + verb + " for a bowl of " + adjective3 + " " + vegetable + "!\n" + 
					exclamation + ", it's still " + verb2 + " and there's a lot of it! Let's go!");
			
			// asks user if they want to play again
			int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?");
			// yes to play again
			if (choice == JOptionPane.YES_OPTION) {
				// sets playAgain to true to keep while loop going
				playAgain = true;
			} 
			// no or cancel to stop playing
			else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
				// sets playAgain to false to stop while loop
				playAgain = false;
			}
		} while (playAgain); // if playAgain is true, keep playing!

	}

}
