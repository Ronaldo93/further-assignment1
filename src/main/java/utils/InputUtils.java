package utils;

import java.util.ArrayList;
import java.util.Scanner;

// we use this class to decouple the input from the view class
// e.g. a form may use input from user, but doing so can clutter the view class
public class InputUtils {
	private static Scanner sc = new Scanner(System.in);

	/**
	 * Get string input from the user
	 * @return User input string
	 */
	public static String getStringInput() {
		return sc.nextLine();
	}

	/**
	 * Validate user input if a string is in the list of forbidden inputs
	 * @param input User input
	 * @param forbiddenInputs List of forbidden inputs (e.g. ids like 1, 2, 3)
	 * @return true if the input is valid, false otherwise
	 */
	public boolean validateInput(String input, ArrayList<Integer> forbiddenInputs) {
		if (forbiddenInputs.contains(Integer.valueOf(input))) {
			// throw new IllegalArgumentException("Invalid input");
			return false;
		}
		return true;
	}
}
