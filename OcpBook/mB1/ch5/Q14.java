package mB1.ch5;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalTime;

public class Q14 {
	static ZoneId zone = ZoneId.of("US/Eastern");
	static LocalDate date =LocalDate.of(2016, 11, 6).plusDays(4);
	static LocalTime time1 = LocalTime.of(2, 15);
	static ZonedDateTime a = ZonedDateTime.of(date, time1, zone);
	public static  void main(String[] str) {
		System.out.println(a);
		
	System.out.println(date.getDayOfMonth());
	System.out.println(date.getDayOfWeek());
	
	
	List<String> a = Arrays.asList("sup1", "sup2", "sup3");
	
	List<String> b= new ArrayList<String>();
	b.add("sup1");
	System.out.println(a.contains("sup1 "));
	
	System.out.println(a.contains("sup1 "));

	}
	
	
}
