package mB1.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Pg210 {

	public static void main(String[] str) {
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 15);
		counts.put("Tom", null);
		Function<String, Integer> mapper = (k) -> 1;
		Integer jenny = counts.computeIfAbsent("Jenny", mapper); // 15
		Integer sam = counts.computeIfAbsent("Sam", mapper); // 1
		Integer tom = counts.computeIfAbsent("Tom", mapper); // 1
		System.out.println(counts); // {Tom=1, Jenny=15, Sam=1}

	}
}
