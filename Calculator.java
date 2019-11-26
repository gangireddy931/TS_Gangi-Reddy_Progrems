package Work; //package create

//import java.util.Scanner;            //creating Scanner class

public class Calculator { // class name create
	public static void mai(String args[]) {
		// Scanner x=new Scanner(System.in); //user given value purpose

		// int number1=x.nextInt(); //user given number1
		// int number2=x.nextInt(); // user given number2
		// int result;
		// char ch=x.next().charAt(0);
		int no1 = 20;
		int no2 = 30;
		char ch = '*';
		switch (ch) // using statement condition
		{

		case '+':
			System.out.println("addition is " + (no1 + no2));
			// result=number1+number2; //using addition operator
			break; // to break the statement
		case '-':
			System.out.println("substraction is " + (no1 - no2));
			// result=number1-number2; //using substraction operator
			break;
		case '*':
			System.out.println("multiplication is " + (no1 * no2));
			// result=number1*number2; //using multiplication operator
			break;
		case '/':
			System.out.println("division is " + (no1 / no2));
			// result=number1/number2; //using division operator
			break;
		default:
			System.out.println("invalid operator"); // using default value
			break;
		}
		System.out.println();
	}

}
