package mB1.ch3;

import java.util.HashMap;
import java.util.function.Predicate;

public class Whiz1Q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String in="Whixd"	;
		Predicate<String> p=s->((String) s).indexOf("i")>0;
		System.out.println(p.and(s->((String) s).length()>4).negate().test(in));
		
		
		HashMap<Integer,String> c= new HashMap<Integer,String>();
	}

}
