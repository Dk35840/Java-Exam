package mB2.ch6;

import java.io.FileNotFoundException;

class OutOfTuneException extends Exception {
	OutOfTuneException(String message) {
		super(message);
	}
}

public class Prac36 {
	public void play() throws OutOfTuneException, FileNotFoundException {
		throw new OutOfTuneException("Sour note!");
	}

	Prac36(String str) {
		super();
	}

	public static void main(String... keys) throws OutOfTuneException {
		final Prac36 piano = new Prac36(null);
		try {
			piano.play();
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
		}
		System.out.println("Song finished!");
	}
}

class ExampleOne implements AutoCloseable {
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close");
	}
}

class ExampleTwo implements AutoCloseable {
	public void close() throws Exception {
		throw new Exception("Cage door does not close");
	}
}

class ExampleThree implements AutoCloseable {
	static int COUNT = 0;

	public void close() {
		COUNT++;
	}
}
