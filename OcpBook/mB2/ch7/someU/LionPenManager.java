package mB2.ch7.someU;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LionPenManager {
	private void removeAnimals() {
		System.out.println("Removing animals");
	}

	private void cleanPen() {
		System.out.println("Cleaning the pen");
	}

	private void addAnimals() {
		System.out.println("Adding animals");
	}

	public void performTask() {
		removeAnimals();
		cleanPen();
		addAnimals();
	}

	
	public void performTask2(CyclicBarrier c1, CyclicBarrier c2) {
		try {
			// it remove the all animals
		removeAnimals();
		// it wait till all the animals remove
		c1.await();
		
		
		cleanPen();
		// it wait till all the pet are clean
		c2.await();
		addAnimals();
		} catch (InterruptedException | BrokenBarrierException e) {
		// Handle checked exceptions here
		}
		}
	public static void main(String[] args) {
		ExecutorService service = null;
		
		// first method
		try {
			service = Executors.newFixedThreadPool(4);
			LionPenManager manager = new LionPenManager();
			for (int i = 0; i < 4; i++) {
				//service.submit(() -> manager.performTask());	
			}
				
		} finally {
			if (service != null)
				service.shutdown();
		}
		
		//second method
		try {
			service = Executors.newFixedThreadPool(4);
			LionPenManager manager = new LionPenManager();
			CyclicBarrier c1 = new CyclicBarrier(4);
			CyclicBarrier c2 = new CyclicBarrier(4,
			() -> System.out.println("*** Pen Cleaned!"));
			for(int i=0; i<4; i++)
				service.submit(() -> manager.performTask2(c1,c2));
				} finally {
				if(service != null) service.shutdown();
				}
	}
}