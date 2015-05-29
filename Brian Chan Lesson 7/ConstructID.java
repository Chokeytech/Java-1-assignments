// Creates a unique ID based on your initials and street address
// Example: The unique ID for Prime Minister (10 Downing) would be: PM10

import java.util.Scanner;


public class ConstructID {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String name = input.nextLine();
		System.out.println("Enter your street address:");
		String address = input.nextLine();
		input.close();
		
		String initials = new String();		
		
		for (int i = 0; i < name.length(); i++) {
			if (i == 0) {
				initials = name.substring(i, i + 1);
			} else if (name.substring(i, i + 1).equals(" ")) {
				i++;
				initials = initials + name.substring(i, i + 1);
			}
		}
		initials = initials.toUpperCase();
		
		String numericAddress = new String();
		
		for (int i = 0; i < address.length(); i++) {
			if (address.substring(i, i + 1).equals(" ")) {
				numericAddress = numericAddress + address.substring(0, i);
			}
		}
		
		String id = initials + numericAddress;
		System.out.println("ID is: " + id);
		

	}

}
