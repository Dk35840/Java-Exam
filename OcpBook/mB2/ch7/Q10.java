package mB2.ch7;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Q10  {

	// unexpected answer due to parallel stream
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.asList("chivn","flamingo","pelibcan")
				.parallelStream().parallel() // q1
				.reduce("",
				(c1, c2) -> c1 + c2.length()
			//	,(s1, s2) -> s1 + s2
				)); // q3
		 
		System.out.println(Arrays.asList(3,4,2,12,1,5).parallelStream().reduce(0,(a,b)->a+b, (c,d)->c+d));
		
		
	}

}


interface c<T>{
    <U> U reduce(U identity,BiFunction<U, ? super T, U> accumulator,  BinaryOperator<U> combiner);
}


//<Integer> Integer java.util.stream.Stream.reduce(Integer identity, BiFunction<Integer, ? super String, Integer> accumulator, BinaryOperator<Integer> combiner)
//<Integer> Integer java.util.stream.Stream.reduce(Integer identity, BiFunction<Integer, ? super Integer, Integer> accumulator, BinaryOperator<Integer> combiner)