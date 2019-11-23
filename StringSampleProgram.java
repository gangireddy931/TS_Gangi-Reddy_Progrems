package Program;

public class StringSampleProgram {

	public static void main(String[] args) {
		String s1 = "Chennai";// given first string
		String s2 = "Chennai";// given second string same name
		String s4 = new String("Chennai");// creating new string and same name
		if (s1 == s4) // using statement for checking Strngs are equal or not
			System.out.println("same");
		else
			System.out.println("not same");
		System.out.println();
	}

}
