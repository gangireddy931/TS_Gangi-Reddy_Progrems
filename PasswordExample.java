package Program;

import java.util.Scanner;

public class PasswordExample {

	public void password() { // creating method

		Scanner x = new Scanner(System.in); // using scanner for user enter purpose

		int counter = 1;
		while (counter <= 3) // using loop user given value checking purpose
		{

			System.out.println("please enter the password");
			String pass = x.next(); // user enter password purpose

			if (pass.equals("admin")) { // password is admin.it is valid password

				System.out.println("valid password");
				break;
			}

			else {
				System.out.println("password invalid");
				break;

			}
		}
	}

	public static void main(String[] args) {
		PasswordString c = new PasswordString();// class using to call method purpose
		c.password(); // calling method
	}

}
