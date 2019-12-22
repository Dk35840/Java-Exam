package mB1.ch4;

import java.util.*;
import static java.util.stream.Collectors.*;

// avoid shared mutability
public class Stream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> n = Arrays.asList(3, 4, 54, 3, 5, 3, 34, 3, 4);

		System.out.println(n.stream().filter(e -> e % 2 == 0));

		// after the breaks
		List<Integer> newList = Arrays.asList(3, 4, 54, 3, 3, 3, 34, 3, 4);

		// wrong way
		List<Integer> doubleOfEven = new ArrayList<>();

		newList.stream().filter(e -> e % 2 == 0).map(e -> e * 2).forEach(e -> doubleOfEven.add(e));
		// it will print double of even integer
		System.out.println(doubleOfEven);

		/*
		 * wrong beause mutubility is ok, sharing is nice but shared mutability is devil
		 * works * friend don't let friends do shared mutation *
		 */
		List<Integer> goodWayDoubleOfEven = newList.stream().filter(e -> e % 2 == 0).map(e -> e * 2).collect(toList());

		System.out.println(goodWayDoubleOfEven);
		
		 // find first smallest number greater than 3
		// it give optional[8] means there are optional value
		System.out.println(
				n.stream()
				.filter(e->e>3)
				.filter(e->e%2==0)
				.map(e->e*2)
				.findFirst());
	}

}
