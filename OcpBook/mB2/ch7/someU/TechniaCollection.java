package mB2.ch7.someU;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TechniaCollection {

	public static void main(String[] args) {
		// A thread-safe variant of ArrayList
		
		// it use where sequential write and concurrent reads on a same collection
		CopyOnWriteArrayList<String> cowa= new CopyOnWriteArrayList();
		cowa.add("technia");
		cowa.add("Transcat");
		Iterator<String> it= cowa.iterator();
		
		while(it.hasNext()) {
			if("technia".equals(it.next())) {
				//it.remove();
				System.out.println(it.next());
			}
		}
		System.out.println(it.toString());
		
		
		// ConcurrentSkipListSet<E>
		
		// ConcurrentHashMap<K,V>
		
		// ConcurrentSkipListMap<K,V>
		
		
		// ConcurrentLinkedQueue
		
		// BlockingQueue
		
		// ArrayBlockingQueue
		
		// PriorityBlockingQueue
		
		// SynchronousQueue
		
		// DelayQueue
		
		//BlockingDeque
		
		//LinkedBlockingDeque
		
	}

}
