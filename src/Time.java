import java.time.LocalDateTime;

public class Time {

	public static void main(String[] args) {
		LocalDateTime.now();
		System.out.printf("this Year : %s %n", LocalDateTime.now().getYear());
		System.out.printf("Month of year is : %s %n", LocalDateTime.now().getMonthValue());
		System.out.printf("Day of Month is : %s %n", LocalDateTime.now().getDayOfMonth());
		System.out.printf("current Hour is : %s %n", LocalDateTime.now().getHour());
		System.out.printf("current Minute is : %s %n", LocalDateTime.now().getMinute());
		System.out.printf("current Second is : %s %n", LocalDateTime.now().getSecond());
	}

}
