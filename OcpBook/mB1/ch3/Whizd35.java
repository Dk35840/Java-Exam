package mB1.ch3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Whizd35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=Arrays.asList(new Integer[] { 3,4,2,4,2,4,94,4});
		
		// whizlab q 35
		//HashMap<Integer,Integer> m= l.parallelStream().collect(Collectors.groupingByConcurrent(i->i%2==0?1:2));
		
		Stream ints= Stream.of("A","B","C","D");
		System.out.println(ints.peek(System.out::print).skip(2).count());
		
		// q 59
		
		Function f=Double::parseDouble;
	System.out.println(f.andThen(s->s*2).apply("1"));
		
	}

}
