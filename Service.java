// Allows user to sort the 6 different services provided by description, price, or time.
// Then displays the 6 services in the chosen order

import java.util.Scanner;

public class Service {
	// initialize variables to hold info about service description, price, and number of minutes
	private String serviceDescription;
	private int price;
	private int numMinutes;

	// constructor that takes in these 3 parameters
	public Service(String serviceDescription, int price, int numMinutes) {
		this.serviceDescription = serviceDescription;
		this.price = price;
		this.numMinutes = numMinutes;
	}

	// 3 get methods
	public String getServiceDescription() {
		return serviceDescription;
	}
	public int getPrice() {
		return price;
	}
	public int getNumMinutes() {
		return numMinutes;
	}

	public static void main(String[] args) {
		// places different services into services array for sorting
		Service[] services = new Service[6];
		services[0] = new Service("Cut", 8, 15);
		services[1] = new Service("Shampoo", 4, 10);
		services[2] = new Service("Manicure", 18, 30);
		services[3] = new Service("Style", 48, 55);
		services[4] = new Service("Permanent", 18, 35);
		services[5] = new Service("Trim", 6, 5);

		// will be used to take in sorting choice
		int choice = 0;

		do {
			// asks user how they would like to sort the services menu
			System.out
					.println("How would you like to sort the services menu? 1) Sort by Service Description, 2) Sort by Price, "
							+ "3) Sort by Time (Minutes), or 0) to Exit.");
			Scanner input = new Scanner(System.in);
			choice = input.nextInt(); // takes in their choice

			Service temp;
			int a, b;
			int highestVal = services.length - 1; // last object in array
			// bubble sort
			if (choice > 0 && choice < 4) {
				// nested for loop for bubble sort
				for (a = 0; a < highestVal; a++) {
					for (b = 0; b < highestVal; b++) {
						int c = b + 1; // 1 more than b -- for easier comparison
						// sorts by service description
						if (choice == 1) {
							// compares service description of one service with the service immediately after it
							if (services[b].getServiceDescription().compareTo(
									services[c].getServiceDescription()) > 0) {
								// reorders the services if B service is later in alphabet than C service
								temp = services[b];
								services[b] = services[c];
								services[c] = temp;
							}
						}
						// sorts by price
						else if (choice == 2) {
							// compares price of one service with the price of the service immediately after it
							if (services[b].getPrice() > services[c].getPrice()) {
								// reorders the services if B price is higher than C price
								temp = services[b];
								services[b] = services[c];
								services[c] = temp;
							}
						}
						// sorts by time
						else if (choice == 3) {
							// compares minutes required of one service with minutes required of the service immediately after it
							if (services[b].getNumMinutes() > services[c]
									.getNumMinutes()) {
								// reorders the services if earlier service takes longer than later service
								temp = services[b];
								services[b] = services[c];
								services[c] = temp;
							}
						}
					}
				} 
				
				// displays services in whatever order was chosen
				for (int i = 0; i < services.length; i++) {
					System.out.printf("Service description: %-9s  Price: $%2d. Minutes required: %2d minutes.\n", services[i].getServiceDescription(), 
							services[i].getPrice(), services[i].getNumMinutes());
				} 
				// adds line
				System.out.println();
			} else if (choice == 0) {
				System.out.println("You have chosen to exit.");
			} else {
				System.out.println("Invalid choice. Press 1, 2, 3, or 0.");
			}
		} while (choice != 0);

		
	}
}
