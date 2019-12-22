package mB2.ch7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

//RecursiveAction and RecursiveTask, both of which implement
//the ForkJoinTask interface.
abstract class MyTask extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

public class Q9 extends MyTask {
	private Integer[] elements;
	private int a;
	private int b;

	public Q9(Integer[] elements, int a, int b) {
		this.elements = elements;
		this.a = a;
		this.b = b;
	}

	public Integer compute() {
		if ((b - a) < 2)
			return Math.min(elements[a], elements[b]);
		else {
			int m = a + ((b - a) / 2);
			System.out.println(a + "," + m + "," + b);
			MyTask t1 = new Q9(elements, a, m);
			int result = t1.fork().join();
			return Math.min(new Q9(elements, m, b).compute(), result);
		}
	}

public static void main(String[] args) throws InterruptedException,
ExecutionException {
Integer[] elements = new Integer[] { 8, -3, 2, -54 };
MyTask task = new Q9(elements, 0, elements.length—1);
ForkJoinPool pool = new ForkJoinPool(1);
Integer sum = pool.invoke(task);
System.out.println("Min: " + sum);
}

	@Override
	public Object getRawResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setRawResult(Object value) {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}
}