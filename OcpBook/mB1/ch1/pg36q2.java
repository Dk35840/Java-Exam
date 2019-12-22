package mB1.ch1;

public class pg36q2 {

	private int ISBN;
	private String title, author;
	private int pageCount;

	public int hashCode() {
		return ISBN;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof pg36q2)) {

			return false;
		}
		pg36q2 other = (pg36q2) obj;
		return this.ISBN == other.ISBN;
	}

	public static void main(String... args) {
		Animal animal = new Lion();
		animal.careFor();
	}

}

// pg 63 book
abstract class Animal {
	public void careFor() {
		play();
	}

	public void play() {
		System.out.println("pet animal");
	}
}

class Lion extends Animal {
	
	// since constructor called and it has super method so it called the  careFor()

	//public void careFor()
	{
		System.out.println("lio careFor method is called");
		play();
	}
	public void play() {
		System.out.println("toss in meat");
	}
}
