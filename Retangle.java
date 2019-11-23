package Program;

//import java.util.Scanner;

public class Retangle {
	int length;
	int bredth;

	public Retangle(int l, int b) { // using constructor

		this.length = l; // calling class object length
		this.bredth = b; // calling class object breath
	}

	public void calcRectangleArea() { // creating method
		int calcArea = bredth * length; // using calculating rectangle area formuula
		System.out.println("area =" + calcArea);
		float perimeter = (float) 2 * (length * bredth);//
		System.out.println("rectangle is =" + perimeter);
	}

	public static void main(String args[]) {
		// Scanner x=new Scanner(System.in);
		Retangle r = new Retangle(3, 5);
		r.calcRectangleArea();

	}
}