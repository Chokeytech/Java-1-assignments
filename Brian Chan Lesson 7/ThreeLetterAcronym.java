// creates an acronym from three words
// Example: Central Intelligence Agency: CIA

import javax.swing.*;

public class ThreeLetterAcronym {

	public static void main(String[] args) {
		int numSpaces = 0;
		String tla = new String();
		int counter = 0;
		String threeWords = JOptionPane.showInputDialog(null, "Please enter three words");

		for (counter = 0; counter < threeWords.length(); counter++) {
			if (threeWords.substring(counter, counter + 1).equals(" ")) {
				numSpaces++;
			}
		}

		if (!threeWords.substring(counter - 1, counter).equals(" ")	&& (numSpaces == 2)) {
			for (int i = 0; i < threeWords.length(); i++) {
				if (i == 0) {
					tla = threeWords.substring(i, i + 1);
				} else if (threeWords.substring(i, i + 1).equals(" ")) {
					i++;
					tla = tla + threeWords.substring(i, i + 1);
				}
			}
			tla = tla.toUpperCase();
			JOptionPane.showMessageDialog(null, "Original phrase was " + threeWords + "\nThree letter acronym is " + tla);
		} else {
			JOptionPane.showMessageDialog(null, "Error: phrase does not contain three words");
		}

	}

}
