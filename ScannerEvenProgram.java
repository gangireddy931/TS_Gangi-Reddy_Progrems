package Work;

import java.util.Scanner;

public class ScannerEvenProgram {
public boolean isEven ()
{
	int number;
		Scanner object=new Scanner(System.in);
			System.out.println("enter number :");
			number=object.nextInt();
			
			
	if(number ==0) {
		System.out.println("is even :"+number);
		
	}
		else
			System.out.println("is odd :"+number);
	return false;
	
			
			
}
	public static void main(String[] args) {
		ScannerEvenProgram s1=new ScannerEvenProgram();
		s1.isEven();

	}
	

}
