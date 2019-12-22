package mB2.ch7;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PQ30 {
	private void waitTillFinished(CyclicBarrier c) {
		try {
			c.await();
			System.out.print("1");
		} catch (Exception e) {
		}
	}

	public void row(ExecutorService service) {
		final CyclicBarrier cb = new CyclicBarrier(5);
		IntStream.iterate(1, i-> i+1)
		.limit(12)
		.forEach(i -> service.submit(() -> waitTillFinished(cb)));
		}

	public static void main(String[] oars) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(9);
			new PQ30().row(service);
		} finally {
			service.isShutdown();
		}
	}
}