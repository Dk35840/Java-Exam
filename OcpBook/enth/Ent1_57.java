package enth;

import java.io.Console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;
 
public class Ent1_57  {
	
	public static void m1() throws Exception{
		throw new Exception();
	}
	public static void m2() throws Exception{

try {
	m1();
}
catch(Exception e) {
	throw e;
}
finally {
	throw new RuntimeException();
	
}
	}
	
	public static void main(String[] args) {
		try {
			m2();
		}
		catch(Exception e) {
			Throwable[] t= e.getSuppressed();
			for(Throwable tt:t)
				System.out.println(tt);
			System.out.println("fd");
		}
		
	}}
