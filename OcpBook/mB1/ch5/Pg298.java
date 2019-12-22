package mB1.ch5;

import java.time.Period;
import java.time.ZoneId;

public class Pg298 {

	public static void main(String[] args) {
		//finding time zone
		ZoneId.getAvailableZoneIds().stream()
		.filter(z -> z.contains("IN") || z.contains("hi"))
		.sorted().forEach(System.out::println);
		//static method
		System.out.println(Period.ofWeeks(1));
		System.out.println(Period.ofYears(1));
		// only  last is run 
		System.out.println(Period.ofYears(1).ofWeeks(1));
		
	}
}
