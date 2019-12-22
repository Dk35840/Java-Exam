package mB1.ch1;

// updated versin on Ques9
public class Ques16{

	private int x = 24;
 class nonstatic_innerClass{
	 
 }
 
 static class StaticClass{
	 
 }
	public int getX() {
	String message = "x is ";
	class Inner {

			private int x = Ques16.this.x;

			public void printX() {
				System.out.println(message + x);
			}
		}
		Inner in = new Inner();
		in.printX();
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ques16().getX();
			
		// treat non static inner class as member so treat as member so define as x.new A();
		nonstatic_innerClass in= new Ques16().new nonstatic_innerClass();
		
		// static class
		StaticClass sc= new StaticClass();
		
		// don't confuse with the method declearation
		StaticClass sc1= StaticClass();
		
	}

	private static StaticClass StaticClass() {
		// TODO Auto-generated method stub
		return null;
	}

}

