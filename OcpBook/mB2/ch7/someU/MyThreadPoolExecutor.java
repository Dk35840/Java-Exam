package mB2.ch7.someU;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPoolExecutor {

	public static void main(String[] args) {
		// Fixed thread pool executor
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
		//Cached thread pool executor
		ThreadPoolExecutor executor2 = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		//Scheduled thread pool executor 
		ThreadPoolExecutor executor3 = (ThreadPoolExecutor) Executors.newScheduledThreadPool(10);
		//Single thread pool executor
		ThreadPoolExecutor executor4 = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();
		//Work stealing thread pool executor
		ThreadPoolExecutor executor5 = (ThreadPoolExecutor) Executors.newWorkStealingPool(4);
		
		Object
		
		
		
	}

}
