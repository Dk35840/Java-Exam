package mB1.ch4;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.BaseStream;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//https://stackify.com/streams-guide-java-8/
public class StreamU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream st = Stream.of(1, 2, 3, 5);
		st.forEach(System.out::print);

		System.out.println("converting array to list and them to stream");
		Integer a[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 8 };

		List<Integer> listOfI = Arrays.asList(a);
		listOfI.stream().forEach(System.out::print);

		Stream.Builder<Integer> intStream = Stream.builder();
		intStream.accept(4);
		intStream.accept(64);
		Stream<Integer> iStream = intStream.build();

		// stream operation
		// https://stackify.com/streams-guide-java-8/

		// for each is the termination operation
		listOfI.stream().forEach(System.out::print);

		System.out.println("map function");
		// map function
		listOfI.stream().map(i -> i * 2).forEach(System.out::print);

		System.out.println("collect function");
		// collect
		listOfI.stream().map(i -> i * 2).collect(Collectors.toList()).forEach(System.out::print);

		System.out.println("Map function with fiter");

		listOfI.stream().map(i -> i * 2).filter(i -> i % 3 == 0).forEach(System.out::print);

		System.out.println("find first");// find first return optional
		System.out.println(listOfI.stream().map(i -> i * 2).filter(i -> i % 3 == 0).findFirst());

		System.out.println("toArray() for conversion of stream to Array");
		Integer[] arr = listOfI.stream().toArray(Integer[]::new);
		for (Integer z : arr)
			System.out.println(z);

		System.out.println("flatMap is for the complex data structure it help to simplify");

		List<List<String>> namesNested = Arrays.asList(Arrays.asList("Jeff", "Bezos"), Arrays.asList("Bill", "Gates"),
				Arrays.asList("Mark", "Zuckerberg"));

		List<String> namesFlatStream = namesNested.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println("peek performed operation on each element of the stream and returns a new stream ");
		// it is intermediate operation can not use for the termination
		listOfI.stream().peek(System.out::println).collect(Collectors.toList());

		System.out.println("steam method type and pipelines");
		// short circuiting operations
		System.out.println(
				"Short-circuiting operations allow computations on infinite streams to complete in finite time");
		
		
		System.out.println("Now presenting the infinite stream");
		Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);
		// infinte stream gives 2,4,8,16,32........
		infiniteStream.skip(2).limit(4).forEach(System.out::println);

		System.out.println("comparision based on stream operations");

		Stream streamSource = Stream.of(1, 6, 4, 1, 2, 3, 5);
		streamSource.sorted().forEach(System.out::print);

		System.out.println(listOfI.stream().min((e1, e2) -> e1 - e2));

		// error checked for it
		System.out.println(listOfI.stream().max((e1, e2) -> e2 - e1));

		// distinct
		listOfI.stream().distinct().forEach(System.out::print);

		// allMatch, anyMatch, noneMatch");

		System.out.println("these take a predicate and return a boolean");
		System.out.println(listOfI.stream().distinct().allMatch(i -> i % 2 == 0));
		System.out.println(listOfI.stream().distinct().anyMatch(i -> i % 2 == 0));
		System.out.println(listOfI.stream().distinct().noneMatch(i -> i % 2 == 0));

		// now Stream Specializations

		// IntStream, LongStream, and DoubleStream these extend BaseStream
		System.out.println("interface IntStream extends BaseStream<Integer, IntStream>");
		IntStream.of(2, 1, 3).forEach(System.out::print);
		System.out.println();
		IntStream.rangeClosed(0, 10).forEach(System.out::print);
		System.out.println();
		IntStream.range(0, 10).forEach(System.out::print);
		System.out.println("average print gives the optional ");
		System.out.println(IntStream.rangeClosed(0, 10).average().orElseThrow(NoSuchElementException::new));

		System.out.println(IntStream.rangeClosed(0, 10).sum());

		// it take 4 and sum to the further
		System.out.println(IntStream.rangeClosed(0, 10).reduce(4, Integer::sum));

		// advance collect operations
		// Collectos.joining use only the stream
		// System.out.println(IntStream.rangeClosed(0,
		// 10).collect(Collectors.joining(",")));

	}

}
