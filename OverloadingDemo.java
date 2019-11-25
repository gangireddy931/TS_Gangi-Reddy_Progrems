package homework;
//it means same method different variables
public class OverloadingDemo {
	public static int sum(int a,int b) {  // taken two variables
		return a+b;
			}
	public static int sum(int a,int b,int c) {  //taking three variables
		return a+b+c;
			}
	public static int sum(int a,int b, int c, int d) { //tking four values
		return a+b+c+d;
	}
public static void main(String args[]) {
	System.out.println(OverloadingDemo.sum(10,20));
	System.out.println(OverloadingDemo.sum(23, 32,45));
	System.out.println(OverloadingDemo.sum(45, 85,78,65));
}
}
