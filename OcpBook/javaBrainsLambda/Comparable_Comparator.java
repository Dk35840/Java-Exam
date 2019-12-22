package javaBrainsLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

//Telusko
public class Comparable_Comparator {

	// sort by last digit
	public static void main(String... strings) {

		List<Integer> values = new ArrayList<Integer>();
		
		values.add(new Integer(3));
		values.add(9);
		values.add(27);
		values.add(66);
		values.add(46);

		Comparator<Integer> cv = new MyComFun1();
		Collections.sort(values, cv);

	//	Comparable<MyComFun2> cv2 = new MyComFun2();
	//	Collections.sort(values);

		for (Integer integer : values) {
			System.out.println(integer);
		}
	}
}

// we use comparator for my sorting technique
// present in java.util
//Collactor and RuleBasedCollector implement it
class MyComFun1 implements Comparator<Integer> {
// also have equal method
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		// 1 means greater , 0 means equal while -1 means negative
		if (o1 % 10 > o2 % 10)
			return 1; // 1 means swap while other not swap
		else if (o1 % 10 == o2 % 10)
			return 0;
		else
			return -1;
	}
	/* If an interface declares an abstract method overriding one of the public methods of 
	 * java.lang.Object, that also does not count toward the interface's abstract method count
	 *  since any implementation of the interface will have an implementation from java.lang.Object or elsewhere
	 *  .(non-Javadoc)  @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		return false;
	// so comparator is functional interface	
	}
}


// Comparable for natural sorting order
// present in java.lang
//all wrapper class and string implements
class MyComFun2 implements Comparable<MyComFun2> {

	private Integer mynum;

	public int getMynum() {
		return mynum;
	}

	public void setMynum(int mynum) {
		this.mynum = mynum;
	}

	@Override
	public int compareTo(MyComFun2 o) {
		// TODO Auto-generated method stub
		return this.mynum.compareTo(o.mynum);
	}
}