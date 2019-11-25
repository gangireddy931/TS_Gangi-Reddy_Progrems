package homework;

import java.util.Scanner;

public class SumOfDigit {
                        //adding given number 
	   //for example 1234=1+2+3+4 like this type
	public static void main(String[] args) {
		int number, num, sum=0;    
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the Number :-");
			number=x.nextInt();  //user will give number
			while(number>0)   //counting purpose using loop
			{
				num=number%10;  //number is divided by 10
				sum=sum+num;     //sum is sum plus after divided number
				number=number/10; //number is remainder of 10
			}
		
		System.out.println(sum);//shows output 

	}

}
