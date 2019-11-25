package homework;

import java.util.Scanner;

public class AverageOfNumbers { // calculating average of three numbers

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in); // user will given values purpose
		System.out.println("Enter first number :-");
		int s = n.nextInt(); // user can enter first number
		System.out.println("Enter the second number :-");
		int p = n.nextInt(); // user can enter second number
		System.out.println("enter  the third number :_");
		int q = n.nextInt(); // user can enter third number
		System.out.print("the average is" + (s + p + q) / 3); // using formula average of three numbers
	}

}
