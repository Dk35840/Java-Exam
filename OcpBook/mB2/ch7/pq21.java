package mB2.ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class pq21 {
	static int stroke = 0;

	public  int swimming() {
		return stroke++;
	}

	public static void main(String... laps) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		pq21 a = new pq21();
		for (int i = 0; i < 100; i++) {
			System.out.println(" " + i + " ");
			service.execute(() -> a.swimming());
			service.execute(() -> System.out.print("zz"));
			Future<?> submit1 = service.submit(() -> System.out.println("aaaaaaaaaafdfd"));

			Future<Integer> submit2 = service.submit(() -> a.swimming());

		}
		try {
		Future<?> submit1 = service.submit(() -> {
			for(int i=0; i<500; i++) a.swimming();
		});

		System.out.println("submit =" + submit1.get());
		//} catch (TimeoutException e) {
		} catch (Exception e) {// why subclass of exception cause error while Exception
			System.out.println("Not reached in time");
			}
		finally {
			if(service != null) service.shutdown();
			}
		System.out.print(a.stroke);
		
		
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);
			// Check whether all tasks are finished
			if(service.isTerminated())
			System.out.println("All tasks finished");
			else
			System.out.println("At least one task is still running");
			}
	}
}
