package mB1.ch4;



import java.util.*;
import java.util.stream.Stream;
public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//lazy evaluation
		// sum(),min, max are end evaluatin functino
		
		//filter , map , limit are lazy function
		
		
		
		
		// steam properties
		// stream is sized and unsized
		// stream is ordered and ordered
		// distinct and undistinct
		//sorted and unsorted
		
		// infinite stream
		System.out.println();
		Stream.iterate(100, e->e+1);
		
		Stream<String> empty = Stream.empty(); // count = 0
	    Stream<Integer> singleElement = Stream.of(1); // count = 1
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
		
		
		
		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		// count method for counting in stream
		System.out.println(fromList.count());
		
		// min max for finding min and max in stream
		Stream<String> s = Stream.of("Monkey","dog","cat");
		Optional<String> min = s.min((s1,s2) -> s1.length()-s2.length());
		
		// it print first minimum
		min.ifPresent(System.out::println);
		System.out.println(min.isPresent());
		
		//findAny and findfirst are work for infinite as they didn't require memory for storage
		
		
		System.out.println("finding find any form the infinite stream");
		//infinite stream
		Stream<String> infinite = Stream.generate(() -> "chimp");
		infinite.findAny().ifPresent(System.out::println);
		
	}

}
