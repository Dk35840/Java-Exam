package mB1.ch5;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class Prac16 {

	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");
		Properties props = new Properties(); // p1
		map.forEach((k,v) -> props.put(k, v)); // p2
		String t = props.get("tool").toString(); // p3
		String n = props.getProperty("nail");
		System.out.println(t + " " + n);
	}

}
