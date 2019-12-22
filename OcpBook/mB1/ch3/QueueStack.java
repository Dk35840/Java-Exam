package mB1.ch3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class QueueStack {
	static {
		System.out.println("any1");
		}
		{
		System.out.println("more");
		}
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	new QueueStack();
	new QueueStack();
	
		Optional<String> ohMy = Stream.of("lions", "tigers", "bears").peek(r -> {int count;count++; System.out.println(r); }).findFirst());
		
		
		Map<String, Integer> map = ohMy.collect(Collectors.toMap(y -> y, z->z.length()));
		
		System.out.println(map); // {lions=5, bears=5, tigers=6}
		
		File f = new File("test/lion");
		Path path = Paths.get("file.txt");
      //  f.createNewFile();
        FileWriter productWriter = new FileWriter(f);
        Files.list(Paths.get("test"));
        
        long dateFilter = 1420070400000l;
       Files.find(path, 10,
        		(p,a) -> p.toString().endsWith(".java")
        		&& a.lastModifiedTime().toMillis()>dateFilter);
        Files.walk(path);
        Files.lines(path);
        List<Double> list = new ArrayList<>();
        Optional<Double> opt = list.stream().sorted().findFirst();
        System.out.println(opt.get() + " " + list.get(0));
        // line vs readAllLines
        Files.readAllLines(Paths.get("file.txt")).forEach(System.out::println);
        Files.lines(Paths.get("file.txt")).forEach(System.out::println);
    
        //readAlllines() return List<String>
      //  Files.readAllLines(path).stream().filter(s -> s.length()>2).forEach(System.out::println);
        // lines() return Stream<String>
      //  Files.lines(path).filter(s -> s.length()>2).forEach(System.out::println);
	}

}




class myIterable implements Iterable{

	@Override
	public Iterator iterator(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
