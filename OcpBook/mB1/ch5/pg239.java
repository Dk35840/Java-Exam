package mB1.ch5;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class pg239 {
	public static void main(String str[]) {
		
		
		
		ZoneId zone = ZoneId.of("US/Eastern");
		
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		
		ZonedDateTime zoned1= ZonedDateTime.of(2015,1,20,6,15,30,200, zone);
		ZonedDateTime zoned2= ZonedDateTime.of(date1, time1, zone);
		ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);
		
		System.out.println(zoned1);
		System.out.println(zoned2);
		System.out.println(zoned3); 
		
		//period represent in terms of years and months and days while duration class represents i
		// terms of seconds and nano seconds
		
		LocalDate i1= LocalDate.parse("2017-05-11");
		
		LocalDate i2=i1.plus(Period.ofDays(5));
		
		
		// for finding difference between the two time
		
		System.out.println(Period.between(i1, i2));
		
		
		System.out.println(Period.between(i1, i2).getDays());
		
		// chrono unit gives 
		
		System.out.println(ChronoUnit.DAYS.between(i1, i2));
		
	// Duration have PT while Period have p
		
		
		System.out.println((long)0.5);
		Duration daily= Duration.ofDays((long) 0.5);  // it gives zero as by convrsion it convert into zero
		System.out.println(daily);
		System.out.println(Duration.ofDays(1));
		System.out.println(Duration.ofHours(1));
		System.out.println(Duration.ofMinutes(1));
		System.out.println(Duration.ofSeconds(1));
		System.out.println(Duration.ofSeconds(1,1));
		System.out.println(Duration.ofMillis(1));
		System.out.println(Duration.ofNanos(1));
		
	/*
	 * public enum ChronoUnit implements TemporalUnit {}
	 * 
	 * TemoralUnit is interface
	 */
		
		
		//Duration.of(unit,ChronoUnit.value
		Duration daily1 =Duration.of(1,ChronoUnit.DAYS);
		
		System.out.println(daily1);
		Duration daily12 =Duration.of(1,ChronoUnit.HALF_DAYS);
		System.out.println(daily12);
		
		// Instant in Time
		Instant instantNow= Instant.now();
		Instant instantfinal= Instant.now();
			System.out.println(Duration.between(instantNow, instantfinal).toMillis());
			// we cannot conver localDateTime to an instant but we can convert zonal date time to instant
			// as instant is point in time
			
			LocalDate ld= LocalDate.of(2018, 12, 17);
					LocalTime lt=LocalTime.of(12, 11);
			ZoneId zoneId=ZoneId.of("US/Eastern");
			ZonedDateTime zdt=ZonedDateTime.of(ld, lt,zoneId);
			System.out.println(zdt.toInstant());// I can not understand some part of it 
			
		///////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("now day light saving output");
			// daylight saving time
			// it only occur in month on march and november only
			
			// eastern GMT-0500
			ZoneId zoneUS = ZoneId.of("US/Eastern");
			// during march
			LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
			LocalTime time = LocalTime.of(1, 30);
			ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
			System.out.println(dateTime);
			dateTime = dateTime.plusHours(1);
			System.out.println(dateTime);// we see time jumps 1 hour more and GMT also changes by -1
			
			
			LocalDate date2 = LocalDate.of(2016, Month.NOVEMBER, 6);
			LocalTime time2 = LocalTime.of(1, 30);
		
			ZonedDateTime dateTime2 = ZonedDateTime.of(date2, time2, zoneUS);
			System.out.println(dateTime2);
			dateTime2 = dateTime2.plusHours(1);
			System.out.println(dateTime2);
	}
}
