package Work;

public class StarPattern {

	public static void main(String[] args) {
		int number=1;//count numbers
		int count=1;  //increment numbers counting
		for(int i=1;i<10;i++)  //outer for loop
		{
			for(int j=0;j<10;j++) //inner for loop
			{
				if(i>j) //if i is graterthan j means print number
				{
				System.out.print("  "+number);
				number++;// after printing number will be increment
				count++;
				}
				else// if not satsfy print empty space
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
