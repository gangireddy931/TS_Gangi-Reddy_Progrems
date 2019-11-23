package Methods;

public class AddDigitsProgram {

	public static void main(String[] args) {
		int sum = 0; // initial sum is zero
		int number = 565;// taken number after adding each one(5+6+5)

		while (number != 0)// counting purpose using loop

		{
			sum = sum + number % 10;// adding sum and number after percentage
			number = number / 10; // number dividing by 10

		}
		System.out.println(sum);
	}

}
