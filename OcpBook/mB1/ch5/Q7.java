package mB1.ch5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.parse("2018-12-11", DateTimeFormatter.ISO_LOCAL_DATE);
		// date.plusDays(2);
		// date.plusHours(3);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

		System.out.println("q 10");
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);

		System.out.println(d);
		Period.ofDays(3);

	}

}

class Building {
}

class House extends Building {

	public void convert() {
		Building b = new Building();
		House h = new House();
		Building bh = new House();
		Building p = (House) b;
		House q = (House) h;
		Building r = (Building) bh;
		House s = (House) bh;

		House p8 = (House) b;
		House q9 = (House) h;
		House r8 = (House) bh;
	}
}