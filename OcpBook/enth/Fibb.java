package enth;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
// create fibconi series
//Applying the fork/join framework requires us to perform three steps:
//1. Create a ForkJoinTask.
//2. Create the ForkJoinPool.
//3. Start the ForkJoinTask

public class Fibb {

	
	static void test() {
	
		LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);         
		ZoneId nyZone= ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = ldt.atZone(nyZone);
		ZoneId laZone=ZoneId.of("America/Los_Angeles");
		ZonedDateTime laZdt = ldt.atZone(laZone);
		Duration d = Duration.between(nyZdt, laZdt);
		System.out.println(d);
	}
	public static void main(String[] args) {
		test();
		IntStream inst = IntStream.of(1, 2, 3);
		int a, b;

		System.out.println("other");

		// fork().join() is same as compute()
// factorial
		NumberTask<?> numberTask = new NumberTask(4);
		ForkJoinPool pool = new ForkJoinPool();
		Integer res = pool.invoke(numberTask);
		System.out.println(res);

		// fibconni
		Fibonacci f = new Fibonacci(7);
		ForkJoinPool pool1 = new ForkJoinPool();
		Integer res1 = pool1.invoke(f);
		System.out.println(res1);
	}

}



class Fibonacci extends RecursiveTask<Integer> {

	int number;

	public Fibonacci(int i) {
		this.number = i;
	}

	@Override
	protected Integer compute() {
		if (number <= 1)
			return 1;
		Fibonacci fib1 = new Fibonacci(number - 1);
		Fibonacci fib2 = new Fibonacci(number - 2);
		return fib1.fork().join() + fib2.fork().join();
		// return fib1.compute()+ fib2.compute();
	}

}

class NumberTask<T> extends RecursiveTask<Integer> {

	int numberTOfind;

	public NumberTask(int numberTOfind) {
		this.numberTOfind = numberTOfind;
	}

	@Override
	protected Integer compute() {
		if (numberTOfind == 1 || numberTOfind == 0) {
			return new Integer(1);
		} else {

			return new NumberTask(numberTOfind - 1).compute() * numberTOfind;
		}

	}

}