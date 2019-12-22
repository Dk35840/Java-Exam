package mB1.ch2;

// for auto code format use
// ctrl+shift+f
class Animal {

	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}

}
// 
interface CheckTrait {
	boolean test(Animal a);
}

public class pg55 {
	private static void print(Animal animal, CheckTrait trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		print(new Animal("fish", false, true), a -> a.canHop());   // same as (Animal a) -> {return a.canHop(); }
		
		// it must return somethings nor it will compile time error
		print(new Animal("fish", false, true), a -> {return a.canHop() ; });
		
		print(new Animal("kangaroo", true, false), a -> a.canHop());
	}
}