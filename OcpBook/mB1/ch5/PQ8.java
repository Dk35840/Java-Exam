package mB1.ch5;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import mB1.ch4.pg188;
import mB1.ch4.pg188.*;
public class PQ8 implements Iterable {
	
	public int hashCode() {
		return 1;
		}
		public boolean equals(Object o) {
		return true ;
		}
	public String toString() {
		return "PQ8 class";
		
	}
	protected void meth1(){
		System.out.println("m1");
	}
	 void meth2(){
		System.out.println("m1");
	}
	private void meth3(){
			System.out.println("m1");
		}
	public static void main(String[] str) {
		PQ8 a= new PQ8();
		System.out.println(a);
		
		System.out.println("a equals null" +a.equals(null));
	
	}
	
	public void tester() {
		new pg188().meth4();
		//pg188.meth4();  not compile as it is class
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}


class class2{
	void method() {
		PQ8 pq=new PQ8();
		pq.iterator();
pq.meth1();
pq.meth2();

	}
	}
	


