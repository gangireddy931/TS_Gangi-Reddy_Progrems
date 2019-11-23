package Methods;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// creating scanner for user given valuse purpose

		System.out.print(" weight in kgs: ");
		double weight = input.nextDouble();// user will give after weight

		System.out.print(" height in centimeters: ");
		double centimeters = input.nextDouble();// user will give after height in inches

		double BMI = weight * 0.0001 / (centimeters * 0.0001 * centimeters * 0.0001);// bodymass
																						// formula(weight/height*height)
		System.out.print("Body Mass Index is " + BMI + " ");

	}

}
