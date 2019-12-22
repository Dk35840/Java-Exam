package mB2.ch6;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q3 {

	static class Door implements AutoCloseable {
		public void close() throws Exception {
			System.out.print("D");
		//	throw new Exception();
		}
	}

	static class Window implements Closeable {
		public void close() throws IOException {
			System.out.print("W");
			//Closeable restricts the type of exception thrown to IOException
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			
			//IOException is checked exception
			throw new IOException();
			// it will compile time error as Unreacable Code
			// System.out.println("fsdf");
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			throw new IOException();
		} catch (FileNotFoundException | RuntimeException e) {
		} catch (IOException e) {

		}

		// question no 5 soleved
		System.out.println("question 5");

		try (Door d = new Door(); Window w = new Window()) {
			System.out.print("T");
		} catch (Exception e) {
			System.out.print("E");
		} finally {
			System.out.print("F");
		}
		
		
		
		// ques 7
		if(args.length <= 3) assert false;
	//	System.out.println(args[0] + args[1] + args[2]);
	}

}
