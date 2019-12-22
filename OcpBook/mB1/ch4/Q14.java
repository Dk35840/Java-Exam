package mB1.ch4;

import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> s11 = Stream.of(1);
		IntStream is = s11.mapToInt(x -> x);
		 DoubleStream ds = is.mapToDouble(x -> x);
		// Stream<Integer> s2 = ds.mapToInt(x -> (int)x);
		// s2.forEach(System.out::print);
		 
		 
		 System.out.println("q 16");
		 Stream<String> s = Stream.empty();
		 Stream<String> s2 = Stream.empty();
		 Map<Boolean, List<String>> p = s.collect(
		 Collectors.partitioningBy(b -> b.startsWith("c")));
		 Map<Boolean, List<String>> g = s2.collect(
		 Collectors.groupingBy(b -> b.startsWith("c")));
		 System.out.println(p + " d" + g);
		 
		 
		 UnaryOperator<Integer> u = x -> x * x;
		 
	}
	
	

}
