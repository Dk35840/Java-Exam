package enth;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.DoubleStream;

public class tt_9 {
	
	static String[] sa = { "a", "aa", "aaa", "aaaa" };
    static
    {
        Arrays.sort(sa);
    }
    
  

static void test() {
	List<String> names= new ArrayList<>();
	names.add("fds");
	Iterator it= names.iterator();
	while(it.hasNext()) {
	// it.remove();
	}
	List<String> names1= new CopyOnWriteArrayList<>();
	names.add("fds");
	Iterator it1= names1.iterator();
	while(it1.hasNext()) {
		           it1.remove();
	}
}

	public static void main(String args[]) throws IOException {
		File f= new File("abc.txt");
		f.createNewFile();
		PrintWriter pw= new PrintWriter(f);
		pw.print("fds");
		pw.flush();
		B aa= new B();
		test();
		LocalDate ld= LocalDate.of(1994, Month.JUNE, 17);
		LocalDate ldn= LocalDate.now();
		LocalTime lt= LocalTime.of(05, 00);
		LocalTime ltn= LocalTime.now();
		LocalDateTime ldt= LocalDateTime.of(ld, lt);
		LocalDateTime ldtn= LocalDateTime.now();
		
		// for chrono unit days
		System.out.println(Duration.between(lt, ltn));
		System.out.println(Period.between(ld, ldn));
		
		// for period.between
	
		//for duration .between
		
	
		iB ic= new iC();
	//	ic.A();
		 List<Integer> ls = Arrays.asList(1, 2, 3);
		
		A o1 = new C();
		B o2 = (B) o1;
		System.out.println(o1.m1());
		System.out.println(o2.m1());
		System.out.println(o2.i);
		
		String a ="fsdfsfs";
		String[] b= a.split("z");
		System.out.println(b[0]);
		

		String search = "";
        if(args.length != 0) search = args[0];
        System.out.println(Arrays.binarySearch(sa, search));
        
        
        
        
        // learning default me
	DoubleStream ds= DoubleStream.of(2,3,3,4,2);
	System.out.println(ds.average());
	}
}
class D extends Thread{
	public void run() {
		System.out.println(" d thread");
	}
}

class E implements Runnable{
	public void run() {
		System.out.println(" e runnable");
	}
	
}

class A {
	int i = 10;

	int m1() {
		return i;
	}
}

class B extends A {
	int i = 20;

	int m1() {
		return i;
	}
}

class C extends B {
	int i = 30;

	int m1() {
		return i;
	}
}

interface iA{
	void m1() throws IOException;
}
interface iB{
	void m1() throws FileNotFoundException;
}

class iC implements iA, iB{
	public void m1() throws FileNotFoundException {
		// TODO Auto-generated method stub
	}
}