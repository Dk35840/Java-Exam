package mB2.ch6;

import java.io.IOException;

public class Prac6 {
	public void turnOn() throws IOException {
		new IOException("Not ready");
		throw new IOException();
	}

	public static void main(String[] b) throws Exception {
	
		for (String c : b)
			System.out.println(c);
		try {
			new Prac6().turnOn();
		} catch (RuntimeException c) { // y1
			System.out.println(b);
			throw new Exception(); // y2
		} finally {
			System.out.println("complete");
		}
	}
}
