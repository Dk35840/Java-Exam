package mB2.ch8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;

public class Pg480  {

	public static void main(String[] args) throws IOException  {
		// zoo.txt must be present in the home directory
		File file = new File("zoo.txt");
		System.out.println(file.exists());
		
		
		// /   indicate from the c drive while other not
		File parent1 = new File("home/smith/");
		File child1 = new File(parent1,"data/zoo.txt");
		System.out.println(child1.exists());
		System.out.println(child1);
		System.out.println(child1.getAbsolutePath());
		System.out.println(parent1.getAbsolutePath());
		
		// with / from the main side
		File parent2 = new File("/home/smith/");
		File child2 = new File(parent2,"/data/zoo.txt");
		System.out.println(child2.exists());
		System.out.println(child2);
		System.out.println(child2.getAbsolutePath());
		System.out.println(parent2.getAbsolutePath());
		Files.readAllLines();
		
		// stream for copy file
		File source = new File("source.txt");
		File destination = new File("destination.txt");
		try {// checked exception must be thrown or handled here we had handle but we can
			// throw also by throws IOException
			copy(source,destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copyBuffer(source,destination);
	}
	
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source);
		OutputStream out = new FileOutputStream(destination)) {
		int b;
		while((b = in.read()) != -1) {
		out.write(b);
		}
		}
}
	
	public static void copyBuffer(File source, File destination) throws IOException {
		try (
		InputStream in = new BufferedInputStream(new FileInputStream(source));
		OutputStream out = new BufferedOutputStream(
		new FileOutputStream(destination))) {
		byte[] buffer = new byte[1024];
		int lengthRead;
		while ((lengthRead = in.read(buffer)) > 0) {
		out.write(buffer,0,lengthRead);
		out.flush();
		}
		}
		}
}
 class Serialized implements Serializable {}