package co.grandcircus;
import java.util.Scanner;

public class CodeChallenge102119 {

		public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);

			int sum = 0;
			int number = 0;
			do {

				System.out.print("Enter a number to add. 0 to stop: ");
				String input = scnr.nextLine();
				
				
				try {
					// This line may throw an exception. What type of exception?
					// Add a try/catch to handle the exception, inform the user
					// that their input is invalid, and continue the loop.
					// (hint: use `continue` keyword)

					number = Integer.parseInt(input);

					sum += number;
				} catch (NumberFormatException e) {
					
				//	System.out.println(e.getMessage());
					System.out.println("Incorrect input");
				
					number = -1; // have to re-assign number value because we initialized it to 0 above, and the do loop
					// will exit because the input is not equal to 0.
					continue;
				}
				
			} while (number != 0);

			System.out.println("The sum is: " + sum);

			scnr.close();
		}

	}