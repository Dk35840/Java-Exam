package javaBrainsLambda;

import java.util.ArrayList;
import java.util.List;

//https://www.journaldev.com/1663/java-generics-example-method-class-interface

class A {}
class B extends A { }
class C extends B { }


public class Generics2 {

	// generic was added for type safety
	public static void main(String[] args) {
		//so the whole collection class was re-written to use it
	      List l= new ArrayList();
	      List<String> l1= new ArrayList();
	      l1.add("java see");
	      // bounds in generic
	      
	      // unbounded wildcards
	      printlist(l1);
	   //   printlist2(l1);
	      
	      
	  //    it give compile time error
	    //  List<Object> l = new ArrayList<String>();
	      
	      
	      // book quesstions
	      List<?> list1 = new ArrayList<A>();
	      
	      // c does not extends a directly but with b help of
	       List<? extends A> list21 = new ArrayList<C>();
	       List<? extends A> list22 = new ArrayList<B>();
	       List<? extends A> list23 = new ArrayList<A>();
	      
	       
	}

	public static void printlist(List<?> l1) { // ? it give the anything
		for(Object x: l1) System.out.println(x);
	}
	
	public static void printlist2(List<Object> l1) {
		for(Object x: l1) System.out.println(x);
	}
	
	
}
