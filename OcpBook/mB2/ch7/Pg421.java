package mB2.ch7;

import java.util.ArrayList;
import java.util.List;

// understanding performance improvement in
public class Pg421 {
	public int processRecord(int input) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// Handle interrupted exception
		}
		return input + 1;
	}

	public void processAllData(List<Integer> data) {
		data.stream().map(a -> processRecord(a)).count();
	}
	public void processAllData2(List<Integer> data) {
		data.parallelStream().map(a -> processRecord(a)).count();
		}

	public static void main(String[] args) {
		Pg421 calculator = new Pg421();
		// Define the data
		List<Integer> data = new ArrayList<Integer>();
		for (int i = 0; i < 99; i++)
			data.add(i);
		// Process the data
		long start = System.currentTimeMillis();
		calculator.processAllData(data);
		
		double time = (System.currentTimeMillis() - start) / 1000.0;
		// Report results
		System.out.println("\nTasks completed in: " + time + " seconds");
		
		
		// parallel processing
		long start2 = System.currentTimeMillis();
calculator.processAllData2(data);
		
		double time2 = (System.currentTimeMillis() - start2) / 1000.0;
		// Report results
		System.out.println("\nTasks completed in: " + time2 + " seconds");
		
	}
}
