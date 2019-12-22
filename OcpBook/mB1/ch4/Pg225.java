package mB1.ch4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class RunClass implements Runnable{
	public void run()	{
		System.out.println("Run method is calling");
	}
}

public class Pg225{

	// Build in functional Interface
	public static void main(String[] args) {
		
		//Implementatin of various functional interface
		
		
		//supplier - It takes no parameter and return value
		Supplier<ArrayList<String>> s1 = ArrayList<String>::new;
		System.out.println(s1.get());
		
		// Runnable a supplier interface
		Runnable r= RunClass::new;
		r.run();
		
		//supplier
		
		
		
		
		
		// Consumer
		Consumer<String> c1 = System.out::println;
		c1.accept("Printing using consumer funtional interface");
		
		ConsumerI(c1,"Printing using consumer functional interface 2");
		ConsumerI(System.out::println,"Printing using consumer functional interface 3");
		
		// predicate and bipredicate'
		
		Predicate<String> p = String::isEmpty;
		System.out.println(p.test("jfg"));
		
		
		// functional and UnaryOperator that extend function have apply method
		UnaryOperator<String> u1= String::toUpperCase;
		System.out.println(u1.apply("MaKe"));
		
	}
	
	// now external method part
	public static void ConsumerI(Consumer<String> ci,String  str) {
		ci.accept(str);
	}


	
	

}

   
