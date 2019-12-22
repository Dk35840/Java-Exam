package mB1.ch1;

import java.util.ArrayList;
import java.util.List;


public class Prac1Q14 {
	
	int DEFAULT_VALUE=0;
	private static class GetSet {
		int first = 5;
		 int second = DEFAULT_VALUE;
		}
	String str = new String();


	public static void main(String[] str) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(8);

		Plant p = new Plant("Plant", l);
		p.getCounts().add(8);
		p.getCounts().set(0, 6);
		System.out.println(p.getCounts());

		Flower f = new Flower("flo", l);
		// Because they do not have a reference to getCount. Rather, they are playing
		// with a second getCount that
		// initially has the same data as getCount.

		f.getCounts().add(8);
		f.getCounts().set(0, 6);
		System.out.println(f.getCounts());

	
	}
}


interface c{
	String s="fdsf";
}
	final class Flower {
		private final String name;
		private final List<Integer> counts;

		public Flower(String name, List<Integer> counts) {
			this.name = name;
			this.counts = counts;
		}

		public String getName() {
			return name;
		}

		public List<Integer> getCounts() {

			return counts;
		}
	}

final class Plant {
	private final String name;
	private final List<Integer> counts;

	public Plant(String name, List<Integer> counts) {
		this.name = name;
		this.counts = new ArrayList<>(counts);
	}

	public String getName() {
		return name;
	}

	public List<Integer> getCounts() {

		return new ArrayList<>(counts);
	}

}
