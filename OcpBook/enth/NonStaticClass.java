package enth;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

interface myInterface{
	void interfaceMethod();
}
public class NonStaticClass {

	String title;
 static String titleStatic ;
 public static void staticMethod() {
	 
 }
	static class StaticClass{
		int c=0;
		void nonStaticMethod() {
			c++;
			
		}
		
		static void staticMethod() {
			System.out.println("i am static mehtod");
		}
	}
	
	 class c2{
		int c=0;
		void inc() {
			c++;
		}
	}
	
	
	 public static void main(String[] str) {
		 
		 
		 new NonStaticClass().new c2().inc(); 
		 
		 // for calling to static class we do not instaniate class 
		String c= NonStaticClass.titleStatic;
		String c1 = new NonStaticClass().titleStatic;
		NonStaticClass.staticMethod();
		
		 
		// calling a non static method from the static method
		// static class is used as a namespace
		new NonStaticClass.StaticClass().nonStaticMethod();
		// calling to static method
		 NonStaticClass.StaticClass.staticMethod();
	 }

	
}

class  outerStaticClass<T> {
	
	//static T data;
	// give error: Cannot make a static reference to the non-static type T
}
