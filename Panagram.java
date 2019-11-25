package homework;

public class Panagram {

	public static void main(String[] args) {
		
		String x="QWERTYIOPASDFGHJKLZXCVBNM";  //given String 
		char y[]=x.toCharArray();     // converting String to charactor
	     int size=y.length;  //finding String length purpose
	     int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};  //t aken initial memory in array charactor counting purose
	     int i=0;
	     
	     while(i!=size) // using loop for checking Size
	     {
	    	int index=y[i]-65; //Ascci values
	    	 a[index]=1;
	    	 i++;
	     }
	     if(x=="A-Z") //checking alphabets available or not
	     {
	     System.out.println("This is panagram");
	     }
	     else
	    	 System.out.println("This is not a panagram");
	}

}
