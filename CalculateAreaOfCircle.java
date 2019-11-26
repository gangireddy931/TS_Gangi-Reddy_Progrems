package Work;

public class CalculateAreaOfCircle {
	// calculaye circle
	public float circleArea(float radius)
	{
		float Area=(2*3.142f*(radius*radius));
		return Area;
	}
	//calculate rectangle
	public float circleArea(int length,int breadth)
	{
				return length*breadth;//rectangle formla
	}
	//calculating triangle
	public float circleArea(float base,float height)
	{
		 return ((base*height)*1/2);//triangle formula
	}


public static void main(String args[]) 
       {
	   CalculateAreaOfCircle f1=new CalculateAreaOfCircle();
	   System.out.println("circle : " +f1.circleArea(5));
	   System.out.println("rectangle : " +f1.circleArea(6f,5f) );
	   System.out.println("triangle : " +f1.circleArea((4f*5f)*1/2) );
       }



}
