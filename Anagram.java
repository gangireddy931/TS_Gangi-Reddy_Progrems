package homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "stop"; // first String
		String secondName = "post"; // changing name

		char a[] = name.toCharArray(); // converting string to char first string
		char b[] = secondName.toCharArray(); // converting second string

		Arrays.sort(a); // sorting of first char value
		Arrays.sort(b); // sorting second vanue

		boolean result = Arrays.equals(a, b); // checking objects true or false
		if (result == true) {
			System.out.println("This is anagram"); // if true means print

		} else {
			System.out.println("This is not anagramS"); // false means print this
		}

	}

}
