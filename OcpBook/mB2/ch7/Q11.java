package mB2.ch7;

import java.util.Arrays;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Q11 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// ques 11
		Object o1 = new Object();
		Object o2 = new Object();
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<?> f1 = service.submit(() -> {
			synchronized (o1) {
				synchronized (o2) {
					System.out.println("Tortoise");
				} // t1
			}
		});
		Future<?> f2 = service.submit(() -> {
			synchronized (o2) {
				synchronized (o1) {
					System.out.println("Hare");
				} // t2
			}
		});
		f1.get();
		f2.get();
		
		
		// quesiton 10
		
	
		System.out.println(Arrays.asList("duck","chick","flam","pelic")
				.parallelStream().parallel() // q1
				.reduce((c1, c2) -> c1 + c2.length())); // q2
			//	(s1, s2) -> s1 + s2)); // q3
		// first reduction
		System.out.println("second reduction");
		// second reduction
		System.out.println(Arrays.asList("duck","chick","flam","pelic").stream().mapToInt(c->c.length()).
				reduce(0,(a,b)->a+b));
		// third reduction
		
		
		// third argument it assumes it is parallel
		//It allows Java to create intermediate reductions and then combine them at the end.
		System.out.println(Arrays.asList("duck","chick","flam","pelic")
				.parallelStream().parallel() // q1
				.reduce(0,
				(c1, c2) -> c1 + c2.length(), // q2
				(s1, s2) -> s1 + s2)); // q3
	}

	
	
	public void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
		deque.offer(103);
		deque.offerFirst(20, 1, TimeUnit.SECONDS);
		deque.offerLast(85, 7, TimeUnit.HOURS);
		System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
		System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));
	}

}
