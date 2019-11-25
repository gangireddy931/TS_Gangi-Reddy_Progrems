package homework;

public class SumArrayValues {

	public static void main(String[] args) {
	   int arr[]= {12,34,32,21,41,43};  //array of numbers  
	   int sum=0;
	   for(int i:arr) 
	   {
		 sum +=i; //adding all array numbers
	   }
System.out.println(sum);
	}

}
