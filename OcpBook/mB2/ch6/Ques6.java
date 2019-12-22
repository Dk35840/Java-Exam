package mB2.ch6;

import java.io.Closeable;

class StuckTurkeyCage implements AutoCloseable {
	 public void close() throws Exception {
throw new Exception("Cage door does not close");
	 }}
public class Ques6 {
	static class Door implements AutoCloseable {
		public void close() {
			System.out.print("D");
			throw new RuntimeException();
		}
	}
// ques 2 
	
	
	static class Window implements Closeable {
		public void close() {
			System.out.print("W");
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) throws Exception {
		//ques 2
		try (StuckTurkeyCage t = new StuckTurkeyCage()) {
			System.out.println("put turkeys in");
			 }
		// ques 6
		try (Door d = new Door(); Window w = new Window()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}

		int n = -2;
		assert n < 0 : "OhNo";

	}

}
