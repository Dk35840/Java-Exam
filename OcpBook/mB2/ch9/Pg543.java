package mB2.ch9;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pg543 {

	public static void main(String[] args) {
		Path pathOFaFile = Paths.get("c:\\testt\\walking.txt");
		Path mainDirectory = Paths.get("c:\\testt");
		Path pathSharks = Paths.get("home/sharks.txt");
		File file = new File("home/");
		System.out.println("Ex 1: walk() ; maxdepth : maximum number of directory levels to visit");

		try {
			Stream<Path> stream = Files.walk(mainDirectory, 1).filter(p -> p.toString().endsWith(".java"));
			stream.forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}

		System.out.println();
		System.out.println("Ex 2: Files.find() traverse the files by using file attributes");
		try {
			//BiPredicate<Path, BasicFileAttributes> matcher
			//here p is path and a is basicFileAttributes
			Stream<Path> stream = Files.find(mainDirectory, 1, (p, a) -> p.toString().endsWith(".java")&&a.lastModifiedTime().toMillis()>0);
			stream.forEach(System.out::println);
		} catch (Exception e) {
			// Handle file I/O exception...
		}

		System.out.println();

		System.out.println("Ex 3: list() vs listFiles() , they retrives the contens of a single directory");
		try {

			Files.list(mainDirectory).forEach(System.out::println);

			for (File f1 : file.listFiles()) {
				System.out.println(f1);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		System.out.println();
		System.out.println("Ex 4: Stream Files.lines(path) ");
		// Files.lines() method reads all of the lines in a file and processes them as
		// they are read.

		try {
			System.out.println(Files.lines(pathOFaFile).filter(s -> s.startsWith("WARN ")).map(s -> s.substring(5))
					.collect(Collectors.toList()));
		} catch (IOException e) {
			// Handle file I/O exception...
		}

		System.out.println();
		System.out.println("Now java various File and path methods");

		

		System.out.println("Ex 5: exists() ");
		System.out.println(file.exists() + " " + Files.exists(pathOFaFile));

		System.out.println("Ex 6: get Name");
		file.getName();
		pathOFaFile.getFileName();

		System.out.println("Ex 7: Absolute path ");
		file.getAbsolutePath();
		pathOFaFile.toAbsolutePath();

		System.out.println("Ex 8: isDirectory in both  ");
		file.isDirectory();
		Files.isDirectory(pathSharks);

		System.out.println("Ex 9: regular file ");
		file.isFile();
		Files.isRegularFile(pathOFaFile);

		System.out.println("Ex 10: Hidden file check ");
		file.isHidden();
		try {
			Files.isHidden(pathSharks);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ex 11: File size ");
		file.length();
		try {
			Files.size(pathSharks);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ex 12 : Last modified date and set last modified date");
		file.lastModified();
		try {
			Files.getLastModifiedTime(pathSharks);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final int time = 32323;
		file.setLastModified(time);
		// Files.getLastModifiedTime(path2, time);

		// file.delete();
		// Files.delete(path2);

		System.out.println("Ex 13: Moving of a file ");
		file.renameTo(file);
		Path source = pathOFaFile;
		Path target = pathSharks;
		try {
			Files.move(source, target);
		} catch (IOException e) {
			System.out.println("Error in moving of a file");
			e.printStackTrace();
		}

		System.out.println("Ex 14: Create dir/ dirs and mkdir() vs mkdirs() ");
		file.mkdir();
		try {
			Files.createDirectories(pathOFaFile);
		} catch (IOException e) {

			e.printStackTrace();
		}

		file.mkdirs();
		try {
			Files.createDirectories(pathSharks);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
