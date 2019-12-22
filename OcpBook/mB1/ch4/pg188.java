package mB1.ch4;

import java.util.*;
import java.util.stream.Stream;

import mB1.ch5.PQ8;

/*
 * we are leaning how to use steam
 */
public class pg188 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// empty stream
			Stream<String> emp=Stream.empty();
			
			// stream of array
			Stream<Integer> fa= Stream.of(1,2,3);
			
			List<String> l=Arrays.asList("a","b","c");
			Stream<String> fromList=l.stream();	
			Stream<String> fromListParallel=l.parallelStream();
			
			Stream singleStream= fromListParallel.sequential();
			
			// for generating infinite number 			
			Stream<Double> randoms = Stream.generate(Math::random);
			//randoms.forEach(System.out::println);
			
			
			
			//fromList.count(4).forEach(System.out::println);
			
			
			
			System.out.println(emp);
			
			
			// q1 
			Stream<String> stream = Stream.iterate("", (s) -> s + "1");
			stream.limit(2).map(x -> x + "2");
			
			//System.out.println(stream.limit(2).map(x -> x + "2").isParallel());
	}
	
	
	// for test purpose of 
	 void meth2(){
			System.out.println("m1");
		}
	 protected void meth1(){
			System.out.println("m1");
		}
	private void meth3(){
		System.out.println("m1");
	}
	public void meth4(){
		System.out.println("m1");
	}
	public String toString() {
		return "PQ8 class";
		
	}
	
	
	
	
	
	

}



