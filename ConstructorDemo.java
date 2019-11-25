package homework;

public class ConstructorDemo {
	String Name; // using name purpose
	int RollNumber; // using rollnumber purpose
	int Age; // using age purpose

	public ConstructorDemo(String name, int rollNumber, int age) { // cerating constructor

		this.Name = name; // using constructor name
		this.RollNumber = rollNumber; // using constructor rollnumber
		this.Age = age; // using constructor age
	}

	public void Display() { // creating method for output purpose
		// printing purpose creating
		System.out.println(
				" Student name is:- " + Name + "  Student RollNumber is:- " + RollNumber + " student age is :- " + Age);
	}

	public static void main(String args[]) {
		ConstructorDemo s1 = new ConstructorDemo("ravi", 12345, 23); // creating new class and inserting
																		// name,rollnumber,age
		ConstructorDemo s2 = new ConstructorDemo("siva", 70321, 45);
		ConstructorDemo s3 = new ConstructorDemo("ravi", 12345, 23);
		ConstructorDemo s4 = new ConstructorDemo("lava", 88370, 55);
		ConstructorDemo s5 = new ConstructorDemo("raju", 83285, 73);
		ConstructorDemo s6 = new ConstructorDemo("naresh", 48296, 95);
		s1.Display(); // calling class from method output printing purpose
		s2.Display();
		s3.Display();
		s4.Display();
		s5.Display();
		s6.Display();

	}
}
