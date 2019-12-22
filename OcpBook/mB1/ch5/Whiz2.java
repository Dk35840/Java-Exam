package mB1.ch5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoUnit;

public class Whiz2 {

	public static void main(String[] args) {
		// since plus has long as well as the TemporalUnit so we to add it
		Duration due = Duration.ofDays(2);
		
	///	it is not present in localdate
	//	LocalDate ld1= LocalDate.of(amount, unit)
		LocalDate ld = LocalDate.of(2016, 1, 1);
		System.out.println(ld.plus(due.toDays(), ChronoUnit.DAYS));

//q 5
		System.out.println(LocalDate.ofYearDay(2019, 1));
		LocalDate ldd = LocalDate.of(2016, 1, 1).now();

// q 7
		Year y = Year.of(2019);
		LocalDate loc = y.atDay(35);
		System.out.println(loc);
		LocalDateTime ldt = loc.atStartOfDay();
		System.out.println(ldt);
		
		// integer to String
		Integer i=41;
		System.out.println(i.toString());
		System.out.println(i.toString(3));
	}

}
