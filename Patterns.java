package homework;

public class Patterns {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {   // top side using loop outer loop purpose
			for (int j = 1; j <= i; j++) {  //using loop inner loop purpose
				System.out.print(j);    //output showing numbers continues increase length
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {  //bottom side using loop outer loop purpose
			for (int j = 4; j >= i ; j--) {  //using loop inner loop purpose
				System.out.print(j);   // output  showing numbers continues decrease length
			}
			System.out.println();
		}
		
	}

}
