package homework;

import java.util.Scanner;

public class SmallestValue {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	System.out.println("enter the first number :-");  // taken user first number for user 
	double a=s.nextDouble();
	System.out.println("Enter the secont number :-");  // taken user second number for user
	double b=s.nextDouble();
	System.out.println("Enter the third number :-");   // taken user third number for user
	double c=s.nextDouble();
System.out.println("smallest value is"+ Math.min(Math.min(a, b), c)+"\3");  //only taken 
	}
	/*public static  double smallest(double a,double b,double c)
	{
return Math.min( Math.min(a,b), c);
	}*/

}
