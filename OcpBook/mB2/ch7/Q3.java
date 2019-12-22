package mB2.ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleWithFixedDelay(() -> { // w1
			System.out.println("Open Zoo");
			return null; // w2
		}, 0, 1, TimeUnit.MINUTES);
		Future<?> result = service.submit(() -> System.out.println("Wake Staff")); // w3
		System.out.println(result.get()); // w4
	}

}
