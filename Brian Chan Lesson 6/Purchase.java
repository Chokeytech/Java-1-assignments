// Displays invoice number, sales amount, and sales tax based on entered invoice number and sales amount

import java.util.Scanner;

public class Purchase {
	int invoiceNumber;
	double salesAmount;
	double salesTax;
	
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
		salesTax = salesAmount * .05;
	}
	
	public void display() {
		System.out.println();
		System.out.println("Invoice number: " + invoiceNumber);
		System.out.println("Amount of sale: $" + salesAmount);
		System.out.println("Amount of sales tax: $" + salesTax);
	}
	
	public static void main(String[] args) {
		Purchase purchase = new Purchase();
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter an invoice number between 1000 and 8000:");
			purchase.invoiceNumber = input.nextInt();
		} while (purchase.invoiceNumber < 1000 || purchase.invoiceNumber > 8000);
		
		do {
			System.out.println("Enter a positive sale amount:");
			purchase.salesAmount = input.nextDouble();
		} while (purchase.salesAmount <= 0);
		
		purchase.setSalesAmount(purchase.salesAmount);
		purchase.display();
	}
}
