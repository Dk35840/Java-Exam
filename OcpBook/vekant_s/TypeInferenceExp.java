package vekant_s;

import mB2.ch10.qhiz3q28;


// this process is called typeinference because a lot of inference is going on
public class TypeInferenceExp  extends qhiz3q28{
	
	public static void printlambda(MyInterface i) {
		System.out.println(i.getLen("hi boy"));
		
	}
	public static void main(String...strings) {
		
		printlambda(s->s.length());
			
		
		// learning the package details
		qhiz3q28 q = new qhiz3q28();
		q.change();
		System.out.println(j);
		
	}
	
	interface MyInterface{
		
		int getLen(String str);
	}
}
