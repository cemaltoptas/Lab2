import java.util.Scanner;

public class Q6_AmountOfPurchase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double stateSalesTax;
		double totalSalesTax;
		double countySalesTax;
		double totalSales;

		System.out.println("Enter the amount of a purchase:");
		double amountOfPruchase = sc.nextInt();

		stateSalesTax = amountOfPruchase * 0.04; // Calculating state sales tax
		countySalesTax = amountOfPruchase * 0.02; // Calculating county sales tax
		totalSalesTax = stateSalesTax + countySalesTax; // Calculating total sales tax
		totalSales = amountOfPruchase + totalSalesTax; // Calculating sales

		System.out.println("The amount of the purchase: " + amountOfPruchase);
		System.out.println("The state sales tax: " + stateSalesTax);
		System.out.println("The county sales tax: " + countySalesTax);
		System.out.println("The total sales tax" + totalSalesTax);
		System.out.println("The total of the sale: " + totalSales);
	}
}
