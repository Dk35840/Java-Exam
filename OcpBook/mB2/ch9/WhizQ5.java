package mB2.ch9;

import java.io.File;
import java.util.List;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WhizQ5 {

	// lines v/s readAlllines
	// readALllines give List<String> while
	// lines give Stream<String>
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("zoo.txt");
	List<String> fileDetails=	Files.readAllLines(Paths.get(f.getPath()));
		for(String s:fileDetails)
			System.out.println(s);
	Stream<String> fileDetails2= Files.lines(Paths.get(f.getPath()));
		fileDetails2.forEach(System.out::println);
	}

}
