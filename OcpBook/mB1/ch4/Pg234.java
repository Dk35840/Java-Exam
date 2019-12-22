package mB1.ch4;

import java.util.*;

import java.util.stream.IntStream;
import java.util.stream.Stream;

class myOwnException extends Exception {

}

public class Pg234 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(average(90, 100));
		System.out.println(average(100, 60, 40));
		System.out.println(average());
		System.out.println(av(90, 100));
		System.out.println(av1(90, 100));
		System.out.println(av2(90, 100));
		System.out.println(av3(90, 100));

		System.out.println("various method of the optional class");
		// for first
		Optional<Double> opt = average(90, 100);
		System.out.println(opt.get());
		System.out.println("\n\n");
		System.out.println("If the value are  present");
		OptionalVariousMethod(average(90, 100));
		System.out.println("\n\n");
		System.out.println("If the value are not present");
		OptionalVariousMethod(average());
		System.out.println("\n\n");
		// stream
		System.out.println("Printing the sum of stream");
		Stream<Integer> s = Stream.of(4, 2, 4, 2, 4);

		System.out.println(s.mapToLong(x -> x).sum());

		// range
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println);
		System.out.println("now printing for closed ie here both are inclusive");
		IntStream range1 = IntStream.rangeClosed(1, 6);
		range1.forEach(System.out::println);
	}

	public static Optional<Double> average(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of((double) sum / scores.length);

	}

	public static Optional<Integer> av(int... scores) {
		if (scores.length == 0)
			return Optional.empty();
		int sum = 0;
		for (int score : scores)
			sum += score;
		return Optional.of(sum / scores.length);

	}

	public static OptionalInt av1(int... scores) {
		if (scores.length == 0)
			return OptionalInt.empty();
		int sum = 0;

		for (int scr : scores)
			sum += scr;
		return OptionalInt.of(sum / scores.length);

	}

	public static OptionalLong av2(int... scores) {
		if (scores.length == 0)
			return OptionalLong.empty();
		int sum = 0;

		for (int scr : scores)
			sum += scr;
		return OptionalLong.of(sum / scores.length);

	}

	public static OptionalDouble av3(int... scores) {
		if (scores.length == 0)
			return OptionalDouble.empty();
		int sum = 0;

		for (int scr : scores)
			sum += scr;
		return OptionalDouble.of(sum / scores.length);

	}

	// here exception is used which is checked exception so either throw or declare
	public static void OptionalVariousMethod(Optional<Double> opt) {
		System.out.println("orElse(99.0): " + opt.orElse(99.0));
		System.out.println("orElse(Double.NaN)): " + opt.orElse(Double.NaN));
		System.out.println("orElse(elseFunctionck(): " + opt.orElse(elseFunctionck()));
		System.out.println("orElseGet(()->elseFunctionck()): " + opt.orElseGet(() -> elseFunctionck()));
		System.out.println("orElseGet(()->99.0): " + opt.orElseGet(() -> 99.0));
		System.out.println("orElseGet(() -> Math.random()): " + opt.orElseGet(() -> Math.random()));
		try {
			System.out.println(opt.orElseThrow(() -> new myOwnException()));
		} catch (myOwnException e) {
			System.out.println("my own exceptin is caught");
			throw new Exception();
		}
	}

	public static Double elseFunctionck() {
		System.out.println("elseFunctionck() method runs");
		return 1.0;
	}
}
