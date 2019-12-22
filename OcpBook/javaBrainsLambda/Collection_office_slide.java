package javaBrainsLambda;

import java.util.*;
import java.util.TreeSet;
import java.util.stream.DoubleStream;
//A collection is a generic term that refers to a container of objects
//java collectin framework is a library of classes and interface
//in the java.util package

/* collection
* Iterable
* List
* Set
* Queue
* Map  it neither implements neither collection and iterable
*/

public class Collection_office_slide {
// collection 3 pg 11
	
	class AnnInnAbstract1 {

	}

	public static void main(String... strings) {

		Collection_office_slide.AnnInnAbstract1 t = new Collection_office_slide(). new AnnInnAbstract1();

		// [-3, -2, -1] [-2, 0, 2]
		// -3,-2,-1,0,1,2
		// -2,1,0,1,2 0 index is removed
		// -2,0,1,2 1 index is removed
		// -2,0,2 2 index is removed

		Set<Integer> set = new TreeSet<Integer>();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = -3; i < 3; i++) {
			set.add(i);
			list.add(i);
		}
		int j = 4;

	DoubleStream dsf= DoubleStream.of(3.4,3.2,2.4);
		
		for (int i = 0; i < 3; i++) {
			set.remove(i);
			list.remove(i);
			// list.remove((Integer)i);
		}

		System.out.println(set + " " + list);

		
		
		System.out.println("Study of anonymous class");
		// an annoyomous abstracat class class
		AnnInnAbstract aia = new AnnInnAbstract() {

			@Override
			int dollarsOff() {
				// TODO Auto-generated method stub
				return 340;
			}
		};

		
		// annoumoous innerclass for interface
		AnnInnInterface aii = new AnnInnInterface() {
			int dollarsOff() {
				return 31;
			}

			public int dollarsOdd() {
				return 32;
			}

		};
		
		
		
		System.out.println("Tree set study ");
		// Treeset example
		
				TreeSet<Integer> numbersTreeSet = new TreeSet<Integer>();
				numbersTreeSet.add(54);
				numbersTreeSet.add(25);
				numbersTreeSet.add(35);
				numbersTreeSet.add(5);
				numbersTreeSet.add(44);
				numbersTreeSet.add(25);
				System.out.println("tree set numberical for ocp :");
				System.out.println(numbersTreeSet);
				System.out.println(numbersTreeSet.lower(25));
				
				//Integer java.util.TreeSet.floor(Integer e)
				//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element
				System.out.println(numbersTreeSet.floor(25));
				System.out.println(numbersTreeSet.higher(25));
				
				//Integer java.util.TreeSet.ceiling(Integer e)
				//Integer java.util.TreeSet.floor(Integer e)
				System.out.println(numbersTreeSet.ceiling(25));
	}

	
}
// learning anonymous class

interface AnnInnInterface {
	int dollarsOdd();
}


abstract class AnnInnAbstract {
	abstract int dollarsOff();
}
