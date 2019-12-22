package mB2.ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

public class PQ38 {
	static Integer cookies = 0;
	 Integer cookies1 = 0;

	public void deposit(int amount) {
		synchronized (cookies) {
			cookies += amount;
		}

	}

	public void withdrawal(int amount) {
		synchronized (cookies) {
			cookies -= amount;
		}

	}

	public synchronized int increment() {
		System.out.println(cookies1+" "+ Thread.currentThread().getId()%10);
		return ++cookies1;
	}

	public static void main(String[] amount) throws InterruptedException, ExecutionException, TimeoutException {
		ExecutorService teller = Executors.newScheduledThreadPool(5);
		PQ38 bank = new PQ38();

		// for (int i = 0; i < 99999; i++) {

		// teller.submit(() -> bank.deposit(5));
		// teller.submit(() -> bank.withdrawal(5));

		// teller.submit(() -> {bank.deposit(5); System.out.println(cookies +" m"
		// +Thread.currentThread());});
		// teller.submit(() -> {bank.withdrawal(5); System.out.println(cookies +" n"
		// +Thread.currentThread());});

		// }
		// teller.shutdown();
		// teller.awaitTermination(10, TimeUnit.SECONDS);
		// System.out.print(bank.cookies);

		// my new question
		ExecutorService es = null;
		Future<Integer> result = null;
		try {
			es = Executors.newFixedThreadPool(10);
			for (int i = 0; i < 100; i++) {

				result = es.submit(() -> bank.increment());
			}
			
			// here result get differnt result ie not 100 because it take last value of the submit which may be any thread that take to the submit
			// so it print the result 
			// while the COOCKIES print value 100 due to synchrisiation
		} finally {
			if (es != null)
				es.shutdown();
		}
		if(es != null) {
			es.awaitTermination(1, TimeUnit.MINUTES);
			// Check whether all tasks are finished
			if(es.isTerminated()) {
				System.out.println("All tasks finished");
				System.out.println("COOCKIES1 " + bank.cookies1 + " res:" + result.get());
			}
			
			else
			System.out.println("At least one task is still running");
			}
		

	}
}
