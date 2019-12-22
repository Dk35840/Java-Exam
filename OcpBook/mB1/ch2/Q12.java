package mB1.ch2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

interface Climb {
	boolean isTooHigh(int height, int limit);
}
interface Predicate<T> {
	  boolean test(T t);
}


public class Q12 {
	/* just think it as
	* p->(int)p > 5 is equal to 
	*/

	private static <T> boolean test(T t) {
		return (int)t>5 ? true : false;
	}
	
	
	public static void main(String[] args) {
	
		check((h, l) -> h>l, 5); // x1
		
		check2( 8);
		
		check3(i->(int)i>5,5);
		
		
		// elements ordertin
		List l= new ArrayList();
		l.add("adsf");
		l.add("addsdsff");
		l.add(33);
		l.add("adsff");
		l.add("adsf");
		System.out.println(l);
		
		Set s= new HashSet();
		s.add("adsf");
		s.add("addsdsff");
		s.add(33);
		s.add("adsff");
		s.add("adsf");
		System.out.println(s);
		
		s.parallelStream().parallel().parallel();
		
		List<? extends Integer> list = new ArrayList<Integer>();
	}

	private static void check(Climb climb, int height) {
		if (climb.isTooHigh(height, 10)) // x2
			System.out.println("hello");
		else
			System.out.println("hello no");
	}
	
	private static void check2(int height) {  // earlier define functional interface as function
		System.out.println(test(height) ? "hellos" : "hello nos");
	}
	private static void check3(Predicate<Integer> pred, int height) {
		System.out.println(pred.test(height) ? "hellos" : "hello nos");
	}
}


