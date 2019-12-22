package mB1.ch4;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class WhizQ4 {

	public static void main(String[] args) {
		Stream<Double> dbls= Stream.of(10.2,11.2,20.2);
		ToDoubleFunction<Double> tif= d->d;
		
		Stream<Double> ints= dbls.mapToDouble(tif).boxed();
		ints.forEach(System.out::print);
Double a= new Double(33.6);

	}

}
