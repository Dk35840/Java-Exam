package mB1.ch3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Magazine implements Comparable{
	private String name;

	public Magazine(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return name.compareTo(((Magazine)o).name);

	}
}

public class PQ12 {
	public static void main(String[] args) {
		Set<Magazine> set = new TreeSet<>();
		set.add(new Magazine("highlights"));
		set.add(new Magazine("Newsweek"));
		set.add(new Magazine("highlights"));
		System.out.println(set.iterator().next());
		
		List<String> list = new ArrayList<>();
		 list.add("Monday");
		 list.add(new String( ));
		 list.add("Tuesday");
		 list.remove(0);
		 System.out.println(list.get(0));
		 

	}
}