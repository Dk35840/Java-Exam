package mB2.ch7.someU;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

//Applying the fork/join framework requires us to perform three steps:
//1. Create a ForkJoinTask.
//2. Create the ForkJoinPool.
//3. Start the ForkJoinTask

public class WeighAnimalTask extends RecursiveTask<Double> {
	private int start;
	private int end;
	private   Double[] weights;

	public WeighAnimalTask(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	// it return the generic type rather than void occurs in RecursiveAction
	protected Double compute() {
		if (end - start <= 3) {
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
				sum += weights[i];
			}
			return sum;
		} else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			RecursiveTask<Double> otherTask = new WeighAnimalTask(weights, start, middle);
		// it works parallel
			//	otherTask.fork();
			//return new WeighAnimalTask(weights, middle, end).compute() + otherTask.join();
			
			
			// it works serial
			Double otherResult= otherTask.fork().join();
			return new WeighAnimalTask(weights, middle, end).compute()+ otherResult;
			
		}
	}

	public static void main(String...strings) {
		Double[] weights= new Double[10];
		ForkJoinTask<Double> task = new WeighAnimalTask(weights,0,weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: "+sum);
		
		
	}
}
