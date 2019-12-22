package mB1.ch5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Prac11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate montyPythonDay = LocalDate.of(2017, Month.MAY, 10);
		LocalDate aprilFools = LocalDate.of(2018, Month.APRIL, 1);
		Duration duration = Duration.ofDays(1);
		//LocalDate result = montyPythonDay.minus(duration);
	//	System.out.println(result + " " + aprilFools.isBefore(result));
		
		
		LocalDate date1 = LocalDate.of(2017, Month.MARCH, 3);
		LocalDate date2 = LocalDate.of(2017, Month.FEBRUARY, 27);
		date2 = date2.plusDays(2).plusDays(2);
		Period period = Period.ofYears(1).ofMonths(6).ofDays(3);
		System.out.println(date2);
		System.out.println(date1.equals(date2));
	}
	

}
