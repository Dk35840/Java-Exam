package mB1.ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Prac36 extends ListResourceBundle {
	static {
		System.out.println("hello meth");
	}
	protected Object[][] getContents() {
		System.out.println("hlo");
		return new Object[][] { { "keys", new ArrayList<String>() } };
	}

	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("mB1.ch5.Prac36");
		List<String> keys = (List) rb.getObject("keys");
		keys.add("q");
		keys.add("w");
		keys.add("e");
		keys.add("r");
		keys.add("t");
		keys.add("y");
		System.out.println(((List) rb.getObject("keys")).size());
		System.out.println(((List) rb.getObject("keys")).size());
	}
}