package Work;

import java.util.Scanner;
public class ScannerSum{
	/*public int doSum(int firstnumber,int secondnumber)
	{
		return firstnumber+secondnumber;
	}*/
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		//ScannerSum s1=new ScannerSum();
		System.out.println("enter number1 : "); // user will enter first number
		int firstnumber=obj.nextInt();
		System.out.println("enter number2 : "); // user will enter first number
		int secondnumber=obj.nextInt();
		int sum=firstnumber+secondnumber;   //adding two variables
		System.out.println("sum number is : "+sum);
		}
	

}
