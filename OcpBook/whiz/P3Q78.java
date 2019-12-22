package whiz;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P3Q78 {

	public static void main(String[] args) {

		// compare take e
		Integer a = 1;// see the difference in different objects
		System.out.println(a.compareTo(3));
		System.out.println("c".compareTo("f"));

		List<Integer> l2 = Arrays.asList(1, 2, 3);
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		ArrayList<Integer> l5 = new ArrayList();
		l5.addAll(l1);

		l5.removeAll(l2);

		// remove/removeAll

		l5.replaceAll(x -> x * 6);

		System.out.println(l5);
		// replace/replaceAll

	}
}
