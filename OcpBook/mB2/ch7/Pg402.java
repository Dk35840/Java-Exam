package mB2.ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pg402 {
	private int sheepCount = 0;

	private void incrementAndReport() {
		System.out.print((++sheepCount) + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(20);
		try {
			
			Pg402 manager = new Pg402();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}