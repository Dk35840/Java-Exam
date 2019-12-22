package mB1.ch3;

import java.util.List;
import java.util.ArrayList;
import static mB1.ch3.random.x;

// we are import statically ie import statement will occurs first
public class WhizQ1 {

	public static void main(String[] args) {
		System.out.println(x);
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(1); 
		l.add(4);
		l.add(9);
		l.stream().peek(System.out::print).parallel().forEach(System.out::print);
		System.out.println();
		l.stream().peek(s->System.out.println(s)).parallel().forEach(System.out::print);

	}

}
