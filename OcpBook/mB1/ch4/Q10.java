package mB1.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q10 {

	public static void main(String[] args) {
		
		
		Stream.generate(() -> "1").limit(10).filter(x -> x.length() > 0).forEach(System.out::print);

		System.out.println("ques 11");

		System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining()));

		System.out.println("ques 13");
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
		Stream.of(l1, l2, l3).flatMap(x -> x.stream()).map(x -> x + 1).forEach(System.out::print);
		
	}

}
