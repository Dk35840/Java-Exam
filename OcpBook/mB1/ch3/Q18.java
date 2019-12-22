package mB1.ch3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q18<C>{
	
	A a2 = new B();
	
	// treat is another type that hide the other type here generic C hide the C class
	// not compile as C is not a class but generic types
	//A a3 = new C();
	
	
	public static <T> T identity(T t) {
		return t;
		}
	
	
	public static void main(String...strings) {
		Set<String> s = new HashSet<>();
		s.add("lion");
		s.add("tiger");
		s.add("bear");
		
		 
		// java.lang.Iterable.forEach(Consumer<? super String> action)
		s.forEach((sa) -> System.out.println(sa) );
		
		
		System.out.println("answer of q 25");
		
		
		// q 25 
		
		
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, null);
		
		
		//java.util.Map.merge(Integer key, Integer value, BiFunction
		//map.merge(key,value, String::concat)
		map.merge(1, 3, (a,b) -> a + b);
		
		
		// it call  by following snippet
		//V newValue = (oldValue == null) ? value : remappingFunction.apply(oldValue, value);
		map.merge(3, 3, (a,b) -> a + b);
		
		System.out.println(map);
		
		pg208(); // putIfAbsent()
	}
	
	
	// putIfAbsent()
	public static void pg208() {
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Tom", null);
		favorites.putIfAbsent("Jenny", "Tram");
		favorites.putIfAbsent("Sam", "Tram");
		favorites.putIfAbsent("Tom", "Tram");
		System.out.println(favorites);
	}
	
	public static void mergeMethod() {
		//merge() allows adding logic to the problem of what to choose
	}
}

class A {}
class B extends A {}
class C extends B {}


