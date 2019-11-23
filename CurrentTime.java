package Methods;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" time zone in GMT: ");
		long timeZoneChange = input.nextInt();

		long totalMilliseconds = System.currentTimeMillis();

		long totalSeconds = totalMilliseconds / 100;// one second calculate millisecond

		long currentSecond = totalSeconds % 60;// calculate current second

		long totalMinutes = totalSeconds / 60;// calculating minutes

		long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;// calculate hours

		long currentHour = ((totalHours + timeZoneChange) % 24);

		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}

}
