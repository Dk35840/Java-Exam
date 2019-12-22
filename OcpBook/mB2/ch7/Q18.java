package mB2.ch7;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.IntStream;

public class Q18 {

	// synchronization method that only one thread can access
	// the resource at a given point of time.

	public static void await(CyclicBarrier cb) { // j1
		try {
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// Handle exception
		}
	}

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(10, () -> System.out.println("Stock Room Full!")); // j2
		IntStream.iterate(1, i -> 1).limit(9).parallel().forEach(i -> await(cb)); // j3
	}
}
