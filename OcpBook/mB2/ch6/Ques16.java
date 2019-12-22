package mB2.ch6;

import java.sql.SQLException;

public class Ques16 extends Error{
	static class Walk implements AutoCloseable {
		public void close() {
			throw new RuntimeException("snow");
		}
	}

	public static void main(String[] args) {
	
		try (Walk walk1 = new Walk(); Walk walk2 = new Walk(); Walk walk21 = new Walk();) {
			throw new RuntimeException("rain");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " " + e.getSuppressed().length);
			
		}
	}
}