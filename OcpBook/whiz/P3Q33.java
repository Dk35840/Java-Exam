package whiz;

import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;



class whizlab<Double> {}
class A{
	public void methodA() {
		System.out.println("A method");
	}
}
class B extends A{
	 void methodB() {
		System.out.println("B method");
	}
} 

public class P3Q33 {

	public static void main(String args[]) {
		A a = new A();
		a.methodA();
		A b = new B();
		b.methodA();
	//	b.methodB();
		B bo= new B();
		bo.methodB();
		bo.methodA();
		
		
		// b arraylist a list
		List al = new ArrayList();
		ArrayList bl= new ArrayList();
		
		
		
		Set<Element> list = new HashSet<>();
		list.add(new Element("Pba", 21));
		list.add(new Element("Cd", 21));
		list.add(new Element("Znhg", 21)); 
		list.add(new Element("Sn", 22));
		System.out.println(list);
		
		 Locale ENUS = new Locale.Builder().setLanguage("en").setRegion("US").build();
         System.out.print(ENUS.getDisplayLanguage(new Locale("fr")));
         
         //83
       
         Period p =Period.ofDays(0);
        		p =p.withDays(2);
      //  p =  p.ofDays(1);
         
         
      System.out.println(p);
	}

	static class Element {
		String name;
		int age;

		Element(String s, int a) {
			name = s;
			age = a;
		}

		public boolean equals(Object o) {
			return age == ((Element) o).age;
		}

		public int hashCode() {
			return name.length();
		}

		public String toString() {
			return name;
		}
	}
}