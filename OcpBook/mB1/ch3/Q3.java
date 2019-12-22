package mB1.ch3;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	
	public static void main(String[] str) {
		List list = new ArrayList();
		 list.add("one");
		 list.add("two");
	 list.add(7);
	 
	 // Here list has object so it give conversion exception
	// for (String s: list)
	 System.out.print(s);	
		
	 
	 List<String> list1 = new ArrayList<>();
	 list1.add("one");
	 list1.add("two");
     //list1.add(7);
 
 // Here list has object so it give conversion exception
 for (String s: list1)
 System.out.print(s);
	}
}
