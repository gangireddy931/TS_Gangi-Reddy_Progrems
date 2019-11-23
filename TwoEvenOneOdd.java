package Program;

import java.util.Scanner;

public class TwoEvenOneOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // using scanner from user give value purpose
		int even = 0; // i am taking initial even number
		int odd = 1; // i am taking initial odd number
		int n = s.nextInt(); // user finally given number purpose

		for (int i = 1; i <= n; i++) // using loop for counting purpose
		{
			if (i % 3 == 0) // i=3 means one odd will come
			{
				odd = odd + 2;
				System.out.print(" " + odd);
			} else {

				even = even + 2; // i!=3 means even will come
				System.out.print(" " + even);

			}

		}
		System.out.println();

	}

}
