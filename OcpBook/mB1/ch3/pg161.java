package mB1.ch3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//import java.util.*;
/*Naming convention for generics
 * E for element
 * K for map key
 * V for map value
 * T for generic data type
 * S,U,V and many for multiple generic types
 */

// ctrl+shift+f for the format the code
public class pg161<T> {

	private T contents;

	public T emptyCrate() {
		return contents;
	}

	public void packCrate(T contents) {
		this.contents = contents;
	}

	public static void main(String[] str) {

		// pg 191
		HashMap<String, String> map = new HashMap<>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		map.put("key1", "value11");

		for (String string : map.keySet()) {
			System.out.println(string);
		}
		for (String string : map.values()) {
			System.out.println(string);
		}

		
		System.out.println("Second question");
		HashMap<String, HashMap<String, String>> map1 = new HashMap<String, HashMap<String, String>>();
		
		
		Map<String, HashMap<String, String>> map2 = new HashMap<String, HashMap<String, String>>();

		map2.put("my key 1", map);

		// to print last value
		for (HashMap hm : map2.values()) {
			int i=hm.values().size();
			
			
			
					//System.out.println(hm.values());

		}

	}

	// public static <A> Crate<A> ship(A a)
	{

	}

}

interface Shippable<T> {
	void ship();
}
