package Program;

public class Sudent {
int rollNum;
String studentname;
float studentperc;

public Sudent(int rollNum, String studentname, float studentperc) {
	
	this.rollNum = rollNum;
	this.studentname = studentname;
	this.studentperc = studentperc;
}
public String showClass() {
	
if(studentperc<=75)
	return ("Distintion");
else if(studentperc<=60 && studentperc<75 )
	return ("first");
else if(studentperc<=60 && studentperc<75 )
	return ("second");
return studentname;


}
}