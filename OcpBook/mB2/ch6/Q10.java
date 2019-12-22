package mB2.ch6;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPlusOne(3, 3);
		throw new  IllegalStateException();
	}
	
	private static int addPlusOne(int a, int b) {
		 assert 4> 1 : false;
		 assert a++ > 0;
		 assert b > 0;
		 return a + b;
		 }

}
