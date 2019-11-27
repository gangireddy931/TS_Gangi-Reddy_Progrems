package Work;                                       //package create

public class GivenCharacterNumberOrAlphabet {        //class name create

	public static void main(String[] args) {
		 
		char ch = '9';                                //taking char value
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) //using condition
		
		System.out.println("given chracter is alphabet");
		
		else if(ch>='0' && ch<='9')
			System.out.println("given chracter is number");
		else
			System.out.println("given chracter is special characters");
	}
	
}
