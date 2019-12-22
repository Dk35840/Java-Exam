package mB1.ch3;

import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.TreeSet;

public class Ques12 implements Comparable<Ques12>, Comparator<Ques12> {

	private int num;
	private String text;

	Ques12(int n, String t) {
	this.num = n;
	this.text = t;
	} 

	public String toString() {
		return "" + num;
	}

	public int compareTo(Ques12 s) {
		return text.compareTo(s.text);
	}

	public int compare(Ques12 s1, Ques12 s2) { return (s1.num - s2.num); }

	// q12
	public static <U extends Exception> void printException(U u) {
		System.out.println(u.getMessage());
	}

	public static void main(String[] args) {
		Ques12.printException(new FileNotFoundException("A"));
		Ques12.printException(new Exception("B"));
		// Ques12.<Throwable>printException(new Exception("C"));
		Ques12.<NullPointerException>printException(new NullPointerException("D"));
		// Ques12.printException(new Throwable("E"));

		Ques12 s1 = new Ques12(88, "a");
		Ques12 s2 = new Ques12(55, "b");
		TreeSet<Ques12> t1 = new TreeSet<>();
		t1.add(s1);
		t1.add(s2);
		TreeSet<Ques12> t2 = new TreeSet<>(s1);
		t2.add(s1);
		t2.add(s2);
		System.out.println(t1 + " " + t2);
	}
}
