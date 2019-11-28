package Work;                                     //create package

public class MarksOfGrade {                    //create class name
	                                             //percentage calculation
public static void main(String args[]) {
	int mark=380;                               //marks given
	float percentage=(mark*100)/600;            //formula of percentage
	System.out.println(" "+percentage);	
	if(mark>=75)                                  //crate condition statement
	System.out.println("you got Distintion"+percentage);
		else if(mark>=60 && mark<75)
		System.out.println("first class"+percentage);	
	else if(mark>=50 && mark<60)
		System.out.println("secong class"+percentage);	
	else if(mark>=35 && mark<50)
		System.out.println("third class"+percentage);	
	else
		System.out.println("pripare next year"+percentage);	
		
	}
	
 }

