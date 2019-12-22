package mB1.ch3;

import java.util.Arrays;
import java.util.List;import java.util.Optional;
import java.util.stream.Stream;

class Blankie {
	String color;

	String getColor() {
		return color;
	}
}

public class PQ35 {
	public static void main(String[] args) {
		Blankie b1 = new Blankie();
		Blankie b2 = new Blankie();
		b1.color = "pink";
		List<Blankie> list = Arrays.asList(b1, b2);
		//list.stream().filter(Blankie::getColor).forEach(System.out::println);
		
		System.out.println(Optional.of((double)6/4));
		
		System.out.println(Optional.of("call me"));
		
		
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
	//animals.flatMap(l -> l.stream()).forEach(System.out::println);
		animals.forEach(System.out::println);
	}
}
