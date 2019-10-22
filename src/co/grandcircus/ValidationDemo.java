package co.grandcircus;

import java.util.Scanner;

public class ValidationDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		checkForInt2(scan);

	}

	public static void checkForInt(Scanner scan) {
		System.out.println("Please enter a number: ");
		if (scan.hasNextInt()) { // checking if it has an int (whole number) before assigning it
			int userNum = scan.nextInt(); // assigns scan.nextInt to userNum
			System.out.println(userNum); 
		} else {
			System.out.println("You need to enter a whole number.");
		}
	}

	public static void checkForInt2(Scanner scan) {
		System.out.println("Please enter a number: ");
		while(!scan.hasNextInt()) {
			scan.nextLine(); // garbage line needed to clean out scanner and stop loop
		System.out.println("Please enter a whole number.");
			if (scan.hasNextInt()) { // checking if it has an int (whole number) before assigning it
			
			} else {
				System.out.println("You need to enter a whole number.");
			}
	}}

}
