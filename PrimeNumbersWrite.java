package Program;

import java.util.Scanner;

public class PrimeNumbersWrite {

	public static void main(String[] args) {
		int number = 0; // initial number
		for (int i = 2; i < 500; i++) { // outer loop check 500 below prime numbers purpose
			for (int j = 2; j < i - 1; j++) { // inner loop check condition is correct or wrong puepose
				number = 0;
				if (i % j == 0) { // if i is module of j equal to 0 not print number
					number++; // increasing number continuesly
					break;
				}

			}
			if (number == 0) // number is zero means it prints prime number
			{
				System.out.print(" " + i);
			}

		}
	}
}