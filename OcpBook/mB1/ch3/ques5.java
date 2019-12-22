package mB1.ch3;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class d{
	class b{
		
	}
}
public class ques5 {
	static  void fun() {
		Map m = new HashMap(); 
        m = System.getProperties(); 
        Random r = new Random(); 
        while (true) { 
            m.put(r.nextInt(), "randomValue"); 
        }
	 }

	public static void main(String...strings) {
		
		IntStream is= IntStream.of(2,2,3);
		is.anyMatch(i->i/2==0);
		String[] p = {"1", "2".concat("3")};
		List<?> list2 = new ArrayList<>(Arrays.asList(p));
		
		// in concurrenthashmap nothing can be null ie no key or null values
		 Map hm = new ConcurrentHashMap();
	  //   hm.put(null, "asdf");  //1
	  //      hm.put("aaa", null);  //2
		d.b ab= new d().new b();
		int s=3,b=3;
		// not compile because generic type are compatible
		//HashSet<Number> hs = new HashSet<Integer>();
		
		// can be this
		HashSet<? extends Number> hs2 = new HashSet<Integer>();
		// don't confuse with this type
		Set<Number> hs1 = new HashSet<Number>();
		
		// q 7
		Set<Number> numbers = new HashSet<>();
		numbers.add(new Integer(86));
		numbers.add(43);
		numbers.add(null);  
		numbers.add(new Integer(86));
		numbers.add(null);
		Iterator iter = numbers.iterator();
		while (iter.hasNext())
			System.out.print(iter.next());
		
	
		System.out.println("compose function ck");
	//compose function
		Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i);
			
				System.out.println(negate.compose(square).apply(10));
				
				System.out.println(square.compose(negate).apply(11));
				
				System.out.println(square.andThen(negate).apply(11));
				
				
				// the 
				Path aPath = Paths.get("D:\\OCPJP\\programs\\..\\NIO2\\src\\.\\SubPath.java");
						aPath = aPath.normalize();
						System.out.println(aPath.subpath(0, 1));
						
						ArrayDeque<Integer> value = new ArrayDeque<>();
						value.push(2);
						value.push(4);
						System.out.println(value.peek());
						value.pop();
						System.out.println(value);
				
		          
	}
}
