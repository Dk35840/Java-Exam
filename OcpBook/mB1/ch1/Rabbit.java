package mB1.ch1;

public class Rabbit {

	private int x = 24;

	public int getX() {
	String message = "x is ";
	class Inner {

			private int x = Rabbit.this.x;

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
		new Rabbit().getX();

	}

}
