package mB2.ch6;

public class Prac32 {
	class Player //implements AutoCloseable 
	{
		
		public void close() throws RingException {
		}
	}

	class RingException extends Exception {
		public RingException(String message) {
		}
	}

	public static void main(String[] notes) throws Throwable {
		try (Player p = null) {
			throw new Exception();
		} catch (Exception e) {
		} catch (Throwable r) {
		}
	}
}
