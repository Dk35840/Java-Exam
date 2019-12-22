package mB1.ch4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import java.time.LocalDateTime;

public class PracQ40 {
	private static void withoutFlatMap(Collection<?> coll) {
		coll.stream().map(x->x.toString())
		.filter(x -> !x.isEmpty())
		.map(x -> x)
		.forEach(System.out::print);
		System.out.println();
		
		
		}
	
	public static void main(String[] args) {
		
		LocalDateTime l;
		List<String> list = new LinkedList<>();
		Deque<String> queue = new ArrayDeque<>();
		queue.push("all queued up");
		queue.push("last");
		withoutFlatMap(queue);
		
		//Create formatter
		DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("M/D/y");
		         
		//Local date instance
		LocalDate localDate = LocalDate.now();
	
		//Get formatted String
		String dateString = FOMATTER.format(localDate);
		 
		System.out.println(dateString);     //07/15/2018
		}
	
	
}
