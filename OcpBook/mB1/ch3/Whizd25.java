package mB1.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


    public class Whizd25 {

	public static void main(String[] args) {
		//https://docs.oracle.com/javase/tutorial/collections/streams/parallelism.html#laziness
		
		
		Stream s= Stream.of(4,2,5,10,11,4);
	//System.out.println(s.peek(System.out::print).anyMatch(x->x>10));
		
		Integer a[] = { 4,2,5,10,12,11,99,4,2};

		List<Integer> listOfI = Arrays.asList(a);
		System.out.println("just");
		//since we had found an element so termianation end since it is lazy evaluaiton
		
		System.out.println(listOfI.stream().peek(System.out::print).anyMatch(x->x>=10));
		
		// explanation:> every element will go at the last ie anyMatch individually and check if it is match or not
		// first 4 went nothing happen,then 2, 5 and 10 for 12 it print true and stop it then all the elements are printed
	}
}
