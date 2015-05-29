// Takes in student ID and outputs first name and GPA
// Student ID, first name, and GPA information are stored in 3 parallel arrays

import javax.swing.JOptionPane;

public class StudentIDArray {

	public static void main(String[] args) {
		int i;
		int id;
		boolean found = false;

		int[] studentID = { 1452, 4522, 4523, 4564, 1235, 1236, 4567, 7898, 4599, 4210 };
		String[] firstNames = { "John", "Mary", "David", "Jeffrey", "Amy", "Megan", "Jason", "Isaac", "Ken", "Julie" };
		double[] gpa = { 4.0, 3.2, 3.5, 3.8, 3.75, 2.8, 3.4, 3.9, 3.8, 3.7 };

		do {
			String idString = JOptionPane.showInputDialog(null,
					"Enter student ID:");
			id = Integer.parseInt(idString);
			for (i = 0; i < studentID.length; i++) {
				if (id == studentID[i]) {
					JOptionPane.showMessageDialog(null, "First name: " + firstNames[i] + "\nGPA: " + gpa[i]);
					found = true;
				}
			}

			if (!found) {
				JOptionPane.showMessageDialog(null, id + " is invalid. Click OK to search again.");
			}
		} while (!found);
	}
}
