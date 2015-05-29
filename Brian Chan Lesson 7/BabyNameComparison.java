// Based on 3 entered first names, the program creates different baby name combinations from differing permutations of the entered names

import java.util.Scanner;

public class BabyNameComparison {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Provide the 1st first name: ");
		String first = input.nextLine();
		System.out.println("Provide the 2nd first name: ");
		String second = input.nextLine();
		System.out.println("Provide the 3rd first name: ");
		String third = input.nextLine();
				
		System.out.println();
		System.out.println("Baby name combinations:");
		System.out.println(first + " " + second);
		System.out.println(first + " " + third);
		System.out.println(second + " " + first);
		System.out.println(second + " " + third);
		System.out.println(third + " " + first);
		System.out.println(third + " " + second);
		
		input.close();
	}

}
