package Methods;

public class FahrenheitConvertsCelcies {

	public static void main(String[] args) {
		int fahrenheit = 212;// converting fahrenheit to celcies
		float celcies = ((fahrenheit - 32) * 5) / 9;// formula
		System.out.println("if the temperature of celcies is: " + celcies);
	}

}
