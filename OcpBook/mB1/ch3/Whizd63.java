package mB1.ch3;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

public class Whizd63 {
	
	public static void main(String[] str) {
		HashMap<Integer, Double> map= new HashMap<>();
		map.put(1,1.1);
		map.put(2, 2.2);
		map.put(1, 3.3);
		ToDoubleBiFunction<Integer,Double> tdf=(a,b) -> a+b;
		map.forEach((k,v)->System.out.print(tdf.applyAsDouble(k,v)));
		
	
	}
	
	

}

