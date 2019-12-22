package mB1.ch4;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q13 {

	public static void main(String[] str) {
		List<Integer> l1 = Arrays.asList(1, 2, 3);
		List<Integer> l2 = Arrays.asList(4, 5, 6);
		List<Integer> l3 = Arrays.asList();
		Stream.of(l1, l2, l3)
		.map(x -> x)
		.flatMap(x -> x.stream()).forEach(System.out::print);
		
		IntStream ls = IntStream.of(1,6, 2, 3);
		 OptionalInt ints= ls.filter(a->a>4).findFirst();
		 ints.ifPresent(System.out::print);
		 if(ints.isPresent()) System.out.println("me");
	}
}
