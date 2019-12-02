package Patterns;

public class PlusTypePatterns {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // outer loop
			for (int j = 1; j <= 5; j++) { // inner loop
				if (i==3 || j == 3) // if i or j is equals means print"+"
					System.out.print("+");
				else // otherwise print zero
					System.out.print("0");

			}
			System.out.println();
		}

	}

}
