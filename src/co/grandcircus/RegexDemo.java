package co.grandcircus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {

		// 1st way of compiling a pattern for regex (regular expressions)
		//Pattern p = Pattern.compile("ABC"); // to see if it will match the pattern "ABC"
		//Matcher m = p.matcher("ABC");
		//boolean b = m.matches();
		//System.out.println(b);

		// 2nd way
		//boolean test = Pattern.matches("[a-z]", "x");
		//System.out.println(test);
		System.out.println(isValidFlightNum("KL445"));
	}

	// write method that checks to see if a flight number is valid
	private static boolean isValidFlightNum(String flightNum) {

		return flightNum.matches("[A-Z]{2}\\d{1,4}");
	}
	
	public static boolean isValidJavaIdentifier(String validIdentifier) {
		return validIdentifier.matches("[a-zA-Z_$][a-zA-z\\d_$*");
	}
	
	//public static boolean isValidJavaIdentifier(String validIdentifier) {
		//return validIdentifier.matches("[]a-zA-Z_$][a-zA-z\\d_$*");

}


