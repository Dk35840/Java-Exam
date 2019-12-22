package whiz;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class P3Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		tmap.put(9, 1);
		tmap.put(7, 3);
		tmap.put(8, 2);
		tmap.put(6, 4);
		System.out.println(tmap.subMap(6, false, 9, true).values());

		System.out.println("new question");
		TreeMap<Key, Integer> tmap1 = new TreeMap<>();
		tmap1.put(new Key(1), 1);
		tmap1.put(new Key(1), 2);
		tmap1.put(new Key(1), 2);
		System.out.println(tmap1.values());

		// set interface
		Set<Key> set = new HashSet<>();
		set.add(new Key(4));
		set.add(new Key(4));
		set.add(new Key(3));
		System.out.println(set);
		
		Set<Key> tree = new TreeSet<>();
		tree.add(new Key(4));
		tree.add(new Key(4));
		tree.add(new Key(3));
		System.out.println(tree);
	}

}

class Key implements Comparable {
	Integer age;

	public Key(int a) {
		this.age = a;
	}

	public boolean equals(Object o) {
		return age.equals(((Key) o).age);
	}
	public String toString() {
		return "" + age;
	}
	public int hashCode() {
		return age;
	}

	@Override
	public int compareTo(Object o) {

		return age.compareTo(((Key) o).age);
	}
}