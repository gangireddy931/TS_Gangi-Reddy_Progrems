package Methods;

import java.util.Scanner;

public class Usehours {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		int min=obj.nextInt();
		int days = min/1440;
		min=min%1440;
		int years = days/365;
		days=days%365;
		System.out.println(years + "years " +days+ "days " +min+ " min" );

	}

}
