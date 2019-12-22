package mB1.ch2;

import java.util.List;


// singleton class type
public class Q7 {
	// JavaBeans is the basic for store data 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


// making it immutable
class Seal {
	String name;
	private final List<Seal> friends;

	public Seal(String name, List<Seal> friends) {
		this.name = name;
		this.friends = friends;
	}

	public String getName() {
		return name;
	}

	public List<Seal> getFriends() {
		return friends;
	}
}
