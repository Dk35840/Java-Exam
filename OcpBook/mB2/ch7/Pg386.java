package mB2.ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pg386 {
	private static int counter = 0;

	/*
	 * benefit of using executor framework ex:-\ a subgke thread handlling all tasks
	 * from an unbounded queue a pool where thread can change the size a pool that
	 * can run taks with delay or periodically
	 */
	
	public static void main(String[] args) throws InterruptedException {

		// first ex
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() ->{ 
				System.out.println("Printing zoo inventory");});
			service.execute(()->{
				for(int i=0;i<4;i++) System.out.println("print zoo inverntory"+i);
			});
			service.execute(() -> System.out.println("printing zoo inventory2"));// executor thread
			System.out.println("end"); // main thread
		} finally {
			if (service != null) {
				service.shutdown();
			}}

	/*	// second ex
		new Thread(() -> {
			Thread t = Thread.currentThread();
		      String name = t.getName();
			Pg386.counter++;
		}).start();


		
		while (Pg386.counter < 1000) {
			System.out.println(Pg386.counter);
			System.out.println("Not reached yet");
			Thread.sleep(1000); // 1 SECOND
		}
		System.out.println("Reached!");
		*/
	}
}