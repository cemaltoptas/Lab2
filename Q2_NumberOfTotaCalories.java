import java.util.Scanner;
public class Q2_NumberOfTotaCalories {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int eatenCookies ;
		
		System.out.println("How many cookies you have eaten?");
		eatenCookies = sc.nextInt();
		
		int servingSize = 40/10;
	    int caloriesPerCookie = 300/servingSize; // Calories per a cookie
	    int totalCaloriesConsumed = eatenCookies * caloriesPerCookie; // Total calories consumed
	 
	    System.out.println("You've eaten : " + eatenCookies + " cookies.");
	    System.out.println("Total calories consumed: " + totalCaloriesConsumed + "cal.");
		

	}

}
