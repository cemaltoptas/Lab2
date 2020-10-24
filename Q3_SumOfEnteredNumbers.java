import java.util.Scanner;

public class Q3_SumOfEnteredNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sumOfEnteredNumbers = 0;

		System.out.println("Enter a positive nonzero integer value:");
		int noneZeroValue = sc.nextInt();

		// Check if number is negative or positive
		if (noneZeroValue < 0) {
			System.out.println("You've entered a negative number");
			return;
		} else {

			for (int i = 1; i <= noneZeroValue; i++) {
				
				sumOfEnteredNumbers += i; // the sum of all the integers from 1 up to final one
			}
			System.out.println("The sum of all the integers from 1 up to " + noneZeroValue + " entered is " + sumOfEnteredNumbers);
		}
	}
}