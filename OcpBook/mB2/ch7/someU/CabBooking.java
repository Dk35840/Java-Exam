package mB2.ch7.someU;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
class sample{
	int i;
	public  sample(int i) {
		this.i=i;
	}
	public static sample f1 (int i) {
		return create(i);
	}
	public static sample f2 (int i) {
		return create(i);
	}
	static sample create(int i) {
		return new sample(i);
	}
	public String toString() {
		return ""+i;
	}
}
public class CabBooking {

	// using cyclic barrier make 3 person auto
	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {
		
		// static method learn 
		System.out.println("static method learn  of factory builder");
		System.out.println(sample.f1(4).f2(5)); 
		// create cyclic barrier with 3
		// create thread with cyclic barrier with 3
		// start and wait individually
		
		//cyclicBarrier.await
		// it is a barrier of three thread
		CyclicBarrier cb= new CyclicBarrier(3);
		
		Thread t1= new Thread(new CabService(cb));
		t1.start();
		t1.setName("thread my 0");
		t1.sleep(2200);  
		Thread t2= new Thread(new CabService(cb));
		t2.start();
		t2.sleep(1200);
		Thread t3 = new Thread(new CabService(cb));
		t3.start();
		t3.sleep(1200);// it is used for current thread for sleeping at execution
		//t3.wait(1200);// it wait for the main thread
		
		// new pool of cyclic barrier
		Thread t4 = new Thread(new CabService(cb));
		t4.start();
		t4.sleep(1200);
		Thread t21= new Thread(new CabService(cb));
		t21.start();
		t21.sleep(1200);
		Thread t31 = new Thread(new CabService(cb));
t31.start();
		t31.sleep(1200);
	}

}



class CabService implements Runnable{
	CyclicBarrier cb;
	CabService(CyclicBarrier cb){
		this.cb=cb;
	}
	
	public void run(){
		try {
			System.out.println(Thread.currentThread().getName()+" has arived ");
			cb.await();
			System.out.println(Thread.currentThread().getName()+" is going  ");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}