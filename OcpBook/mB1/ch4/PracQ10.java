package mB1.ch4;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class PracQ10 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(9, 3);
		 Stream result = Stream.of(3,2,4,5);
		System.out.println(result.iterator().next());
		}
}
