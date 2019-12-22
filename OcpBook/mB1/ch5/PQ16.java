package mB1.ch5;

import java.util.*;
import java.util.Properties;
import java.util.TreeMap;

public class PQ16 extends ListResourceBundle{

	public static void main(String[] str) {
		Map<Object, String> map = new HashMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");
		Properties props = new Properties(); // p1
		map.forEach((k,v) -> props.put(k, v)); // p2
		Object t = props.get("tool"); // p3
		Object n = props.get("nail");
		System.out.println(t + " " + n);
		
		Locale loc= Locale.ENGLISH;
		
		System.out.print(props.getProperty("mystery", "?"));
	}

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return null;
	}

}


