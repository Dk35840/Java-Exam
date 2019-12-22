package mB2.ch7;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// program to sleep 50000 for callable

class MYCallable implements Callable<String> {

	public String call() throws Exception {
		Thread.sleep(1000);
		return "we come";
	}
}

public class Hw {

	public static void main(String[] str) throws Exception {
		
	
		String s= "fdsfsd|fds";
		String[] sa= s.split("\\|");
		for(String sz: sa)
			System.out.println(sz);
		MYCallable mc = new MYCallable();
		ExecutorService es = Executors.newSingleThreadExecutor();
		Future<String> fr = es.submit(mc);
		System.out.println(fr.get());
		es.shutdownNow();
		
//2019-06-05T11:49:11.341Z
		
		System.out.println(Instant.now());
		System.out.println(Instant.now());
		System.out.println(Instant.now().plusNanos(1));
		System.out.println(Instant.now());
		System.out.println(Instant.now());
	}
}
