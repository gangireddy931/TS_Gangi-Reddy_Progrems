package Patterns;

public class ASymbolPattern {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {// outer line
			for (int j = 7; j > i; j--) {// inner line
				System.out.print(" ");// it will prints empty spaces
			}
			for (int k = 0; k <= i; k++) {// inner line for particular values purpose
				if (i == 4 || k == 0 || k == i)
					System.out.print(" " + "*");// if statement is valid means it will prints
				else
					System.out.print(" " + " ");// else print empty space
			}
			System.out.println();// goto next line purpose
		}

	}

}
