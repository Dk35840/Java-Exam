package mB2.ch7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class Q12 extends RecursiveAction {
	private int start;
	private int end;

	public Q12(int start, int end) {
		this.start = start;
		this.end = end;
	}

	protected void compute() {
		if (start < 0)
			return;
		else {
			int middle = start + ((end - start) / 2);
			try {
				invokeAll(new Q12(start, middle), new Q12(middle, end)); // m1
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ForkJoinTask<?> task = new Q12(0, 4); // m2
		ForkJoinPool pool = new ForkJoinPool();
		Object result = pool.invoke(task); // m3
		System.out.println(result);
	}
}