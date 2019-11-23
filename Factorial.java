package Methods;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:- ");
		int number;// initial number after user given
		number = s.nextInt();// user given purpose
		int fact = 1; // initial factorial
		for (int i = 1; i <= number; i++)// counting purpose useing loop
		{
			fact = fact * i; // factorial formula using
		}
		System.out.println(" " + fact);
	}

}
