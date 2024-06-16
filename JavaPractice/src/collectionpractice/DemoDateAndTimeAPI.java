package collectionpractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DemoDateAndTimeAPI {

	public static void main(String[] args) {
		// Date and Time API is also known as joda time API developed by joda.org

		// To get current system Date and Time

		LocalDate date = LocalDate.now();
		System.out.println(date);

		// to specify date in our required format
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yy = date.getYear();

		System.out.printf("%d:%d:%d", dd, mm, yy);

		System.out.println();
		LocalTime time = LocalTime.now();
		System.out.println(time);

		int h = time.getHour();
		int m = time.getMinute();
		int s = time.getSecond();
		int n = time.getNano();

		System.out.printf("%d:%d:%d:%d", h, m, s, n);

		// to get both Current system date and time

		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

		int d = dt.getDayOfMonth();
		int mm1 = dt.getMonthValue();
		int y = dt.getYear();

		System.out.printf("Date:%d-%d-%d", d, mm1, y);

		int h1 = dt.getHour();
		int m1 = dt.getMinute();
		int s1 = dt.getSecond();
		int n1 = dt.getNano();

		System.out.printf("\nTime:%d:%d:%d:%d", h1, m1, s1, n1);
		System.out.println();
		LocalDateTime dt1 = LocalDateTime.of(1998, Month.MARCH, 7, 8, 30);
		System.out.println(dt1);

		//
		System.out.println(dt1.plusMonths(11));
		System.out.println(dt1.plusMinutes(45));

		// to get exact age till today

		LocalDate birthday = LocalDate.of(1998, 3, 7);
		LocalDate today = LocalDate.now();

		Period age = Period.between(birthday, today);

		System.out.println();
		System.out.printf("Current age in years %d, months %d, days %d", age.getYears(), age.getMonths(),
				age.getDays());

		LocalDate remainingDay = LocalDate.of(1998 + 60, 3, 7);
		Period remainingDays = Period.between(today, remainingDay);

		System.out.println();
		int d1 = remainingDays.getYears() * 365 + remainingDays.getMonths() * 30 + remainingDays.getDays();
		System.out.printf("Remaing days to live %d", d1, "let's do it sirrrrrrrrrr");

		// to check given year is leap year or not

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		int year = sc.nextInt();
		// use Year class
		Year y1 = Year.of(year);
		if (y1.isLeap()) {
			System.out.println(y1 + " " + "given year is leap year");
		} else {
			System.out.println(y1 + " " + "given year is not leap year");
		}
		
		// finding zone of system
		
		ZoneId zd = ZoneId.systemDefault();
		System.out.println(zd);
		
		// to find date and time of America/los-angles
		
		ZoneId la = ZoneId.of("America/Los_Angeles");
		ZonedDateTime ld = ZonedDateTime.now(la);
		System.out.println(ld);
	}

}
