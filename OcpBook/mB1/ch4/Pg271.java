package mB1.ch4;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pg271 {

	public static void main(String[] args) {

		// pg 271
		Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> map = ohMy.collect(Collectors.toMap(s -> s, String::length));
		System.out.println(map); // {lions=5, bears=5, tigers=6}
System.out.println();
		// pg 272
		Stream<String> ohMy1 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> map1 = ohMy1.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2));
		System.out.println(map1); // {5=lions,bears, 6=tigers}
		System.out.println(map1.getClass()); // class. java.util.HashMap
		System.out.println();

		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer,String> map9= ohMy2.collect(Collectors.toMap(String::length, k -> k, (s1,s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(map9);
	System.out.println(map.getClass());
	System.out.println();

	Stream<String> ohMy11 = Stream.of("lions", "tigers", "bears");
	Map<Integer, List<String>> map11 = ohMy11.collect(
	Collectors.groupingBy(String::length));
	System.out.println(map11);
	
	
	News s= new News();
	}

}

class News<News>{
	News(){
		int a=4;
	}
	
}
