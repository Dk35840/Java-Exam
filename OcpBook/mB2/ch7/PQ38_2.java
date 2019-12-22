package mB2.ch7;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PQ38_2 {

	 int cookies ;

	public  void increment() {

		 ++cookies;
	}

	public static void main(String[] amount) throws InterruptedException, ExecutionException{
		ExecutorService teller = Executors.newScheduledThreadPool(5);
		PQ38_2 bank = new PQ38_2();

		Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, String> map = ohMy
		.collect(Collectors.toConcurrentMap(String::length, k -> k,
		(s1, s2) -> s1 + "," + s2));
		System.out.println(map); // {5=lions,bears, 6=tigers}
		System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
		
		Stream<String> ohMy2 = Stream.of("lions", "tigers", "bears").parallel();
		ConcurrentMap<Integer, List<String>> map2 = ohMy2.collect(
		Collectors.groupingByConcurrent(String::length));
		System.out.println(map2); // {5=[lions, bears], 6=[tigers]}

	}

}
