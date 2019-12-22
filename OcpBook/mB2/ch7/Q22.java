package mB2.ch7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

public class Q22 {
	static int counter = 0;

	// execute return the  void 
	// submit return the future
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		List<Future<?>> results = new ArrayList<>();
		//IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> results.add(service.execute(() -> counter++)) // n1
		IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> results.add(service.submit(() -> counter++)) // n1

	);
		for (Future<?> result : results) {
			System.out.print(result.get() + " "); // n2
		}
		service.shutdown();
	}
}