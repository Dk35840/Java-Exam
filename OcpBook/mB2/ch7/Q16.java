package mB2.ch7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.DoubleStream;

// execute does not support callable so that it can return anything
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newScheduledThreadPool(10);
		DoubleStream.of(3.14159,2.71828) // b1
		.forEach(c -> service.submit( // b2
		() -> System.out.println(10*c))); // b3
		service.execute(() -> System.out.println("Printed")); // b4
		}
	}

