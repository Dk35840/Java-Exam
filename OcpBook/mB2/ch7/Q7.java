package mB2.ch7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;


class ClassThread extends Thread{
	public void run() {
		System.out.println("Class thread run");
		}
	
	public void start() {
		System.out.println("start method called");
	}
	}
class ClassRunnable implements Runnable{
	int i;
	
	
	@Override
	public void run() {
		System.out.println("run method called of runnable");
	}
}
class ClassCallable implements Callable<Integer>{
	int i;
	 ClassCallable(int i){
		this.i=i;
	}

	@Override
	public Integer call() {
		// TODO Auto-generated method stub
		return 6;
	}
}

class ClassCallable1 implements Callable<String>{
	int i;
	 ClassCallable1(int i){
		this.i=i;
	}

	@Override
	public String call() {
		// TODO Auto-generated method stub
		return "";
	}
}

public class Q7 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		
		// callable annoymous innerclass
		Callable<Integer> c= new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				System.out.println("My annoymous inner class for callable interface");
				return null;
			}
			
		};
		
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(1, 2, 3);

		// The CopyOnWriteArrrayList class is designed to preserve the original list on
		// iteration,
		List<Integer> l2 = new CopyOnWriteArrayList<>(l1);

		// The ConcurrentSkipListSet class allows modifications while iterating, so it
		// is possible that the second loop could generate an infinite loop.
		Set<Integer> s3 = new ConcurrentSkipListSet<>();
		s3.addAll(l1);
		for (Integer item : l2)
			l2.add(4); // x1
		for (Integer item : s3)
			s3.add(5); // x2
		System.out.println(l1.size() + " " + l2.size() + " " + s3.size());

		
		System.out.println("q 10 of book solution as parallel stream output not fixed");
		Arrays.asList(1, 2, 3, 4).parallelStream().parallel().forEach(System.out::println);
		
		// Future is not a result but it promise there would be resultby calling get after completion
		
		System.out.println("output of callable :------------ ");
		
		// both callable and runnable can be run by executorService
		ExecutorService esC= Executors.newFixedThreadPool(2);
		
		Future<Integer>  future=esC.submit(new ClassCallable(5));
		
// calling of Callable
		int f=future.get();
		System.out.println(f);
		
		// calling a runnable
		System.out.println("output of runnable :------------ ");
		Thread t= new Thread(new ClassRunnable());
		t.start();
	// ClassThread
		System.out.println("output of thread :------------ ");
		ClassThread ct= new ClassThread();
		ct.run();
		ct.start();
	}

}
