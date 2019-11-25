package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramAnotherWay { // using scanner creating anagram program

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first  String:-");
		String c = s.nextLine(); // user will give string name first
		System.out.println("Enter the econd String:- ");
		String b = s.nextLine(); // user will give string name using first string
		char x[] = c.toCharArray(); // converting string to char first string

		char y[] = b.toCharArray(); // converting string to char second string

		Arrays.sort(x); // sorting of first char value
		Arrays.sort(y); // sorting of second char value
		boolean result = Arrays.equals(x, y); // checking objects true or false
		if (result == true) {
			System.out.println("given String is anagram"); // false means print this
		} else {
			System.out.println("given String is not anagram"); // false means print this

		}
	}
}
