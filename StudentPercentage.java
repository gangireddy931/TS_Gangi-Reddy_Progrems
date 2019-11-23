package Program;

public class StudentPercentage {

	public static void main(String[] args) {
		Sudent s = new Sudent(1, "gangi", 62.90f);// creating direct student name ,roll number,percentage of one student
		System.out.println(s.studentname + " got " + s.showClass());// printing direct process
		Sudent s1 = new Sudent(2, "harish", 72.90f);// creating ssecond student details directly
		System.out.println(s1.studentname + " got " + s.showClass());// pring directly
	}

}
