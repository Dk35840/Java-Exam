package mB1.ch5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;
import java.util.ResourceBundle;

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long epochSeconds=0;
		Instant instant1=Instant.ofEpochSecond(epochSeconds);
		System.out.println(instant1);
		
		
		//d 71
		Locale loc= new Locale("de","fr");
		ResourceBundle rb =ResourceBundle.getBundle("mB1.ch5_source.Zoo",loc);
System.out.println(rb.getString("hello"));


System.out.println("printing the local now");
System.out.println(LocalDate.now());
System.out.println(LocalTime.now());
System.out.println(LocalDateTime.now());
System.out.println(ZonedDateTime.now());


LocalDate date = LocalDate.of(2015, 5, 25);
LocalTime time = LocalTime.of(11, 55, 00);
ZoneId zone = ZoneId.of("US/Eastern");
ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
System.out.println(instant);

ZoneId zoneIndia = ZoneId.of("Asia/Kolkata");
ZonedDateTime zonedDateTime1 = ZonedDateTime.of(date, time, zoneIndia);
Instant instant11 = zonedDateTime1.toInstant(); // 2015–05–25T15:55:00Z

System.out.println(zonedDateTime1); // 2015–05–25T11:55–04:00[US/Eastern]
System.out.println(instant11);
 // 2015–05–25T15:55:00Z
	}

}


