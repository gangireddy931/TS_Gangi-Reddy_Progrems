package Program;

public class EveOdd {
	// checking that two even numbers and one odd number order
	public static void main(String[] args) {
		int count = 2, odd = 1; // using initial numbers

		for (int i = 1; i <= 10; i++) // using loop for countig purpose
		{
			System.out.print(" " + count); // counting initial number of firdt even
			count = count + 2;
			System.out.print(" " + count); // counting secound number of even
			odd = odd + 2;
			System.out.print(" " + odd); // counting odd number

			count = count + 2;
		}
		System.out.println();
	}

}
