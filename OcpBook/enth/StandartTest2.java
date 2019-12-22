package enth;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


 enum StandartTest662{
	
	a("dsf"),b,c,d,e;
	 
	 ///StandartTest2(String s){
		 
	 }
	
}
class StandartTest2 {

	public static void main(String[] args) {
	
		ZoneId nyZone= ZoneId.of("America/New_York");
		ZoneId laZone= ZoneId.of("America/Los_Angeles");
		LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);         
		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		ZonedDateTime laZdt = ldt.atZone(laZone);
		System.out.println(nyZdt);
		System.out.println(laZdt);
		
		
		List<String> vals = Arrays.asList("a", "b", "c", "d", "e", "f", "g", 
				"a", "b", "c", "d", "e", "f", "g",
				"a", "b", "c", "d", "e", "f", "g",
				"a", "b", "c", "d", "e", "f", "g");
				String join = vals.parallelStream()
				        .peek(System.out::println) //this shows how the elements are retrieved from the stream
				        .reduce("_", 
				                (a, b)->{ 
				                    System.out.println("reducing "+a+" and "+b+" Thread: "+Thread.currentThread().getName());
				                    return a.concat(b);
				                },
				                (a, b)->{ 
				                    System.out.println("combining "+a+" and "+b+" Thread: "+Thread.currentThread().getName());
				                    return a.concat(b);
				                }
				        );
	}

}
