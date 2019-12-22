package vekant_s;

import java.util.Arrays;
import java.util.List;


// stram api helps in mutation by working varous method on the same java member

//stream is default method in collection and list and has various methods and it returns 
// object of Stream interface
public class lambdaAndStream {
	public static void main(String...strings)
	{
		List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		// bad choice receiving something and passing to another
		numbers.forEach(value->System.out.print(value));
		// shorter
		// method refrence :: it is called accept  		
		numbers.forEach(System.out::print);
		
		
		
		// try for int check
		int[] i= new int[]{4,2,5,3,5};
		for (int j : i) {
			System.out.println(j);
		}
	}
}
