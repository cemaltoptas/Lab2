import java.util.Scanner;

public class Q1_DisplayLargestAndSmallestNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int firstNumber;
		int nextNumber;
		int number;

		System.out.println("Enter yout first number");
		firstNumber = sc.nextInt();

		System.out.println("Enter your next number");
		nextNumber = sc.nextInt();

		do {
			System.out.println("Do you want to enter another number -->  0 - NO , 1 - YES");
			number = sc.nextInt();
			if (number == 1) {
				System.out.println("Enter your next number");
				nextNumber = sc.nextInt();
			} else {
				if (firstNumber > nextNumber) {
					System.out.println("The largest number is " + firstNumber);
					System.out.println("The smallest number is " + nextNumber);
				} else {
					System.out.println("The largest number is " + nextNumber);
					System.out.println("The smallest number is " + firstNumber);
				}
			}

		} while (number != 0);

	}

}
