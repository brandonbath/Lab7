// @Brandon Bath

package co.grandcircus;

import java.util.Scanner;


public class LabNumber7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//System.out.println("hello");
		//System.out.println("this code will be flawless");

		// name validator
		System.out.println("Please enter your first name (Capitalize first letter)");
		String userName = scan.nextLine();

		if (anyValidator(userName, ("[A-Z][a-z]{1,30}"))) {
			System.out.println("Thank you! (Name)");
		} else {
			System.out.println("Sorry, name is not valid!");
		}
		// email validator
		System.out.println("Please enter your email: ");
		String userEmail = scan.nextLine();
		if (anyValidator(userEmail, ("((([A-Za-z0-9]{5,30})(@))(([A-Za-z0-9]{5,10})).([A-Za-z]{2,3}))"))) {
			System.out.println("Thank you! (Email)");
		} else {
			System.out.println("Sorry, email is not valid!");
		}

		// phone number validator
		System.out.println("Please enter your phone number (xxx-xxx-xxxx format): ");
		String userPhone = scan.nextLine();
		if (anyValidator(userPhone, ("([0-9]{3}-[0-9]{3}-[0-9]{4})"))) {
			System.out.println("Thank you! (Phone number)");
		} else {
			System.out.println("Sorry, number is not valid!");
		}

		System.out.println("Please enter a date (xx/xx/xxxx format):  ");
		String userDate = scan.nextLine();
		if (anyValidator(userDate, ("([0-1][0-9]/[0-3][0-9]/[1-2][0-9]{3})"))) {
			System.out.println("Thank you! (Date)");
		} else {
			System.out.println("Sorry, date is not valid!");
		}
	scan.close();
	}

	// validator method
	public static boolean anyValidator(String name, String regex) {

		return name.matches(regex);

	}

}

