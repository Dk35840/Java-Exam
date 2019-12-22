package mB1.ch3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q6<T> {
	T t;

	public Q6(T t) {
		this.t = t;
	}

	public String toString() {
		return t.toString();
	}

	public static void main(String[] args) {
		
		
		System.out.print(new Q6<String>("hi"));
		System.out.println(new Q6("there"));

		// my own
		System.out.println(new Mystring("fsdfs"));
		System.out.println(new Mystring<String>("fsdfs2"));

		Comparator<Integer> comp = Integer::compare;

		comp.compare(1, 2);
		// Comparator c= (e1,e2)-> e1.length>e2.length;
		List a = new ArrayList();
		a.add(4);

		List<? extends Number> list = new ArrayList<Number>();
		list.add(4, null);

		Comparator.comparing(e -> ((Integer) e).intValue());
		// System.out.println(System.out::println);
	}
}

//Here string is type created by me
class Mystring<String1> {

	String1 str;

	public Mystring(String1 str) {
		this.str = str;
	}

	public java.lang.String toString() {
		return str.toString();
	}
}