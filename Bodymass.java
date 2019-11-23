package Methods;

public class Bodymass {

	public static void main(String[] args) {
		double pounds = 452; // creating weight
		double inches = 72; // creating height
		double bodymass = (pounds * 0.453592 / (inches * 0.0254 * inches * 0.0254));
		// formula(wight/hight*hight)
		System.out.println("body masss index is :" + bodymass);
	}

}
