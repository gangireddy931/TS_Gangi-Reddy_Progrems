package Work;

public class FibonacciSeriesProgram {
	public static void main(String args[]) {    
		 int firstnumber=0,secondnumber=1,thirdnumber,i,count=20;    
		 System.out.print(firstnumber+" "+secondnumber);        //printing 0 and 1    
		    
		 for(i=2;i<count;++i)               //loop starts from 2 because 0 and 1 are already printed    
		 {    
		  thirdnumber=firstnumber+secondnumber;       
		  System.out.print(" "+thirdnumber);    
		  firstnumber=secondnumber;    
		  secondnumber=thirdnumber; 
		  
		 }    
		  
		}
	}  