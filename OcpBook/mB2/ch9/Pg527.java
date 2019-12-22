package mB2.ch9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

// possible reason for the failure is the their encoding ie UTF-8 or UTF-16
// check wisely for it 
public class Pg527 {
	public static void main(String[] str) throws IOException {

		try {
			System.out.println("ex 1 Rename the directory");
			Files.move(Paths.get("c:\\testt\\zooo"), Paths.get("c:\\testt\\zoo-new"));

			System.out.println("move the file from one folder to another and rename it");
			Files.move(Paths.get("c:\\testt\\zoo\\tes2.txt"), Paths.get("c:\\testt\\zoo-new\\tes3.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("ex 2 Diff b/w delete and deleteIfExists");
		try {
			Files.delete(Paths.get("c:\\testt\\zoo\\f.txt"));
			Files.deleteIfExists(Paths.get("c:\\testt\\zoo"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("ex 3 use of getName");
		Path path = Paths.get("/land/hippo/harry.happy");
		System.out.println("The Path Name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}

		System.out.println("ex 4 use of createDirectory v/s createDirectories");
	try {
		Files.createDirectory(Paths.get("c:\\testt\\field"));

		// it create all the path is testt if it not present
		Files.createDirectories(Paths.get("c:\\testt/bison/field/pasture/green"));
	}catch(Exception e){
		System.out.println("can't not create directory due to FileAlreadyExistsException");
	}
		

		System.out.println("ex 5 Buffered Reader");

		Path path11 = Paths.get("c:\\testt/gopher.txt");
		try (BufferedReader reader = Files.newBufferedReader(path11, Charset.forName("UTF-16"))) {
			// Read from the stream
			String currentLine = null;
			while ((currentLine = reader.readLine()) != null)
				System.out.println(currentLine);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("ex 6 Buffer Writer");
		// ex 6
		Path path12 = Paths.get("c:\\testt/gopher.txt");
		List<String> data = new ArrayList();
		try (BufferedWriter writer = Files.newBufferedWriter(path12, Charset.forName("UTF-16"))) {
			writer.write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}
	

		System.out.println("pg 537");
		Path path131 = Paths.get("c:\\testt/gopher11.txt");
		BasicFileAttributes data11 = Files.readAttributes(path131, BasicFileAttributes.class);
		System.out.println("Is path a directory? " + data11.isDirectory());
		System.out.println("Is path a regular file? " + data11.isRegularFile());
		System.out.println("Is path a symbolic link? " + data11.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? " + data11.isOther());
		System.out.println("Size (in bytes): " + data11.size());
		System.out.println("Creation date/time: " + data11.creationTime());
		System.out.println("Last modified date/time: " + data11.lastModifiedTime());
		System.out.println("Last accessed date/time: " + data11.lastAccessTime());
		System.out.println("Unique file identifier (if available): " + data11.fileKey());
	}

}
