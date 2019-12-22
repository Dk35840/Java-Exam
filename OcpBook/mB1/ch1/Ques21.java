package mB1.ch1;

interface Otter {
	default void play() {
	}

	String toString();

	// see it overrides it
	// A default method cannot override a method from java.lang.Object
	// default int hashCode() {}
}

public class Ques21 implements Otter {

	public static void main(String[] args) {
		System.out.println("main method is calling");

	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

	// @Override public boolean equals(Otter o) { return false; }

	@Override
	public int hashCode() {
		return 42;
	}

	// @Override public long hashCode() { return 42; }

	@Override
	public void play() {
	}

	// by default it assign the package default which is less than the public access
	// modifier so error
	// @Override void play() {}

}
