package whiz;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class P3Q55 {
	public static void main(String[] args) {

		IntStream stream = IntStream.of(2, 4, 6, 1, 34, 5, 9);
		DoublePredicate pre = d -> d > 1;

		System.out.println(stream.asDoubleStream().anyMatch(pre));
	}
}