package mB1.ch3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.TreeSet;

public class Q4 {

	// Arrays l = new Arrays();
	public static void main(String... sysout) {
		int[] numbers = { 6, 9, 1, 8 };
		// Arrays is utility class dont confuse with Array[]
		Arrays.sort(numbers);
		System.out.println(numbers[0]);

		// peek() method return next or null
		ArrayDeque<String> greetings = new ArrayDeque<String>();
		greetings.push("hello");
		greetings.push("hi");
		greetings.push("hold");
		 
		
		System.out.println(greetings.peek());
		greetings.pop();
		greetings.peek();
		// without importing ArrayDeque class it does not give error on peek as it does not load what it is ?
		while (greetings.peek() != null) {
		//	System.out.print(greetings.peek());
		System.out.println(greetings.pop());
		
		System.out.println(compare("a","c"));
		
		
		//pg 188
		Queue<Integer> dequeue = new ArrayDeque<>();
		}

		
		
		
	}
	public static int compare(String a, String b) {
		return b.toLowerCase().compareTo(a.toLowerCase());
		}
	


}
