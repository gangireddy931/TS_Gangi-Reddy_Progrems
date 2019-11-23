package Program;

import java.util.Scanner;

public class PasswordString {
	public void password() {
		Scanner x = new Scanner(System.in);
		System.out.println("please enter 6 digit password");
		String pass = x.next(); // must be enter six digit password
		if (pass.length() < 6) // password must be graterthan six letters
			System.out.println("please enter valid password");

		else if (pass.equals("talent")) // correct password is talent
			System.out.println("password correct");
		else
			System.out.println("password invalid"); // if you give wrong theyshows invalid password
	}

	public static void main(String[] args) {
		PasswordString c = new PasswordString();// calling to class
		c.password(); // calling to method using class
	}
}
