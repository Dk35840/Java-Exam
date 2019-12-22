package mB2.ch7;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Pg410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
		Set<Integer> s3 = new ConcurrentSkipListSet<>();
		s3.addAll(l1);
		for(Integer item: l2) l2.add(4); // x1
		for(Integer item: s3) s3.add(5); // x2
		System.out.println(l1.size()+" "+l2.size()+" "+s3.size());
		
		// since set unique element
		System.out.println(l1+" "+l2+" "+s3);
	}

	
	// both incrementAndReport1 and 2 are equivalent
	int sheepCount=0;
	
	// it uses synchronized modifier
	private void incrementAndReport() {
		synchronized(this) {
		System.out.print((++sheepCount)+" ");
		}
		}
	
	// it uses synchronized method
		private synchronized void incrementAndReport1() {
		System.out.print((++sheepCount)+" ");
		}
}
