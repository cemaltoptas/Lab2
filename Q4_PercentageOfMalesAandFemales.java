import java.util.Scanner;

public class Q4_PercentageOfMalesAandFemales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numberOfMales;
		int numberOfFemales;
		double totalOfMalesFemales = 0;

		System.out.println("Enter the number of males:");
		numberOfMales = sc.nextInt();

		System.out.println("Enter the number of females:");
		numberOfFemales = sc.nextInt();

		// Calculating the total of males and females in the class
		totalOfMalesFemales = numberOfMales + numberOfFemales;

		// Calculating percentage of males and females in the class
		double percentageOfMales = (numberOfMales / totalOfMalesFemales) * 100;
		double percentageOfFemales = (numberOfFemales / totalOfMalesFemales) * 100;

		System.out.println("Percentage of males in the class: " + percentageOfMales);
		System.out.println("Percentage of females in the class: " + percentageOfFemales);

	}

}
