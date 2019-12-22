package mB1.ch5;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;


class A{


	void mA() {
		System.out.println("A");
	}
}
class B extends A{
	void mA() {
		System.out.println("B");
	}
}

class C extends A{
	boolean equals(C r){
		return false;}
}
public class pg320 {
	public static void main(String[] args) {
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat us = NumberFormat.getInstance(Locale.US);
		System.out.println(us.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));

		// pg 323
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
// System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
		
		
		A a = new B();
		A b = new C();
		b.mA();
		a.mA();
		
		List<> hello ;
		
	}
}
