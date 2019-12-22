package mB2.ch9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Q6 {
	public static void main(String...strings) {
		Path path = Paths.get("home/sharks.txt");
		boolean myBoolean = Files.walk(path)
		.filter((p,a) -> path.equals(p)) // w1 
		.findFirst().isPresent(); // w2
		System.out.println(myBoolean ? "No Sub-directory": "Has Sub-directory");
	}
}
