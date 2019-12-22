package mB2.ch7;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class PQ9 {
	private void await(CyclicBarrier c) {
		try {
			c.await();
		} catch (Exception e) {
		}
	}

	public void march(CyclicBarrier c) {
		ExecutorService s = Executors.newFixedThreadPool(4);
		for (int i = 0; i < 12; i++)
			s.execute(() -> await(c));
		s.shutdown();
	}

	public static void main(String... strings) {
		new PQ9().march(new CyclicBarrier(4, () -> System.out.println("Ready")));
	// q 11
		List<Integer> ls = Arrays.asList(3,4,5,6,0,1,8,9); 
		// serial stream
	System.out.println(ls.stream().findAny());
	System.out.println(ls.stream().findFirst());
	System.out.println(ls.stream().limit(6).findFirst());
	System.out.println(ls.stream().skip(3).findFirst());
	
	System.out.println("parallel stream");
	// parallel stream
	System.out.println(ls.parallelStream().findAny());
	System.out.println(ls.parallelStream().findFirst());
	System.out.println(ls.parallelStream().limit(6).findFirst());
	System.out.println(ls.parallelStream().skip(3).findFirst());
	
	//q12
	Arrays.asList(1,2,3,4).stream()
	.forEach(System.out::print);
	Arrays.asList(1,2,3,4).parallelStream()
	.forEachOrdered(System.out::print);
	
	Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream().parallel().parallel().parallel();
	Stream<Integer> stream1 = Arrays.asList(1,2,3,4,5,6).parallelStream().parallel();
	Stream<Integer> stream22 = Arrays.asList(1,2,3,4,5,6).stream();
	}
}