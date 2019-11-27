package Work;                                    //create package

public class LeapYear {                          //class name created
                                                  //identify leapyeer
	public static void main(String[] args) {
		int year=2020;                               //given year
		if(year%4==0)                                 //using condition and formula
			System.out.println("it's a leapyear");
		else
			System.out.println("it's not a leapyear");
	}

}
