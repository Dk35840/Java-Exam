package mB1.ch5;

import java.util.Locale;
import java.util.ResourceBundle;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale fr = new Locale("fr");
		 Locale.setDefault(new Locale("en"));
		 ResourceBundle b = ResourceBundle.getBundle("mB1.ch5_source.Zoo", fr);
		System.out.println( b.getString("name"));
		System.out.println(b.getString("age"));  
		System.out.println(Locale.getDefault());
	}

}
