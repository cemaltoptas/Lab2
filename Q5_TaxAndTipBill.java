import java.util.Scanner;

public class Q5_TaxAndTipBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double taxAmount;
		double tipAmount;
		double totalBill;

		System.out.println("Enter the charge for the meal");
		double mealCharge = sc.nextDouble();

		taxAmount = (mealCharge * 6.75) / 100;     // Calculating tax amount
		tipAmount = (mealCharge + taxAmount) * 0.2;   // Calculating tip amount
		totalBill = mealCharge + taxAmount + tipAmount;   // Calculating total bil

		System.out.println("Meal Charge: " + mealCharge);
		System.out.println("Tax Amount: " + taxAmount);
		System.out.println("Tip Amount: " + tipAmount);
		System.out.println("Total Bill:" + totalBill);
	}
}
