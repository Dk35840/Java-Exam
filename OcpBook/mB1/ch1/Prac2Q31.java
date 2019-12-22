package mB1.ch1;

interface Alex {
	default void write() {
		System.out.println("alex write");
	}

	static void publish() {
		System.out.println("alex publish");
	}

	void think();
}

interface Michael {
	public default void write() {
		System.out.println("Michael write");
	}
	public default void write2() {
		System.out.println("Michael write2");
	}
	public static void publish() {
		System.out.println("Michael publish");
	}

	public void think();
}

public class Prac2Q31 implements Alex, Michael {
	
	public static void main(String...strings) {
		Michael m= new Prac2Q31();
		Michael.publish();
		m.write();
		m.write2();
	}
	@Override
	public void write() {
		System.out.println("All write");
	}

	
	
	
	public static void publish() {
	}

	@Override
	public void think() {
		System.out.print("Thinking...");
	}
}
