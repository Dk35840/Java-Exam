package mB2.ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PQ7 {

	
		public void submitReports() throws InterruptedException, ExecutionException {
			ExecutorService service = Executors.newCachedThreadPool();
			 Future bosses = service.submit(() -> System.out.print(""));
			 service.shutdown();
			 System.out.print(bosses.get());
			 }
			 public static void main(String[] memo) throws Exception{
		 new PQ7().submitReports();
		 }
		 }