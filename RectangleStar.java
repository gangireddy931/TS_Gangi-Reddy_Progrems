package Patterns;

public class RectangleStar {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // outer for loop
			for (int j = 1; j <= 5; j++) { // inner for loop
				if (i >= 2 && j >= 2 && i <= 4 && j <= 4) { // if i and j is equals to 2,and 4 means it prints space
					System.out.print(" ");
				} else { // i,j not equals means print *

					System.out.print("*");
				}

			}

			System.out.println();
		}
	}

}
