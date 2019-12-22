package mB2.ch7.someU;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// 1 java thread = 1 os thread
public class DefogTech {
/*
 * four thread pool ->
 * fixed thread pool
 * cachedThread pool
 * ScheduledThread Pool
 * SingleThreadExecutor
 */
	public static void main(String...strings) {
		
		// for finding number of core is cpu
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(Runtime.getRuntime().freeMemory()/1024);
		// the output is random please donot take it serious
		for(int i=0;i<100;i++) {
			Thread t1= new Thread(new Task());
			t1.start();
			
		}
		System.out.println(Thread.currentThread().getName());
		
		
		// ExecutorService it does not create mulitple thread but uses them
		
		//cpu intensive = cpu core count while io intensive higher pool side
		ExecutorService service = Executors.newFixedThreadPool( 5);
		ExecutorService service1 = Executors.newFixedThreadPool( 5);
		System.out.println("1 fixed threadPool");
		for(int i=0;i<10;i++) {
			
			// here we does not start but execute them
			service.execute(new Task());
			service1.execute(new Task());
		}
		
		// cached thread pool
		System.out.println("2 cached threadPool");
		ExecutorService cachedThreadPool= Executors.newCachedThreadPool();
         for(int i=0;i<10;i++) {
        	// System.out.println("cached thread");
        	 cachedThreadPool.execute(new Task());
		}
		
         
         System.out.println("3 fixed scheduledPool");
		// scheduled executor service
         ScheduledExecutorService sec= Executors.newScheduledThreadPool(10);
         
         // task to run after 10 sec
         sec.schedule(new Task(),10,TimeUnit.SECONDS);
         
         // task to run repeatedly every 10 sec
       //  sec.scheduleAtFixedRate(new Task(),15,10,TimeUnit.SECONDS);
         
         // task to run repeatedly 10 sec after previous task comoplete
        // sec.scheduleWithFixedDelay(new Task(), 15,10,TimeUnit.SECONDS);
		
         
         
         /// single thread pool
         
       
	}
	

}

class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print(Thread.currentThread().getName());
	}
	
}