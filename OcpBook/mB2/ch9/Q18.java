package mB2.ch9;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
public class Q18 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("/testt/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("/testt/././actions/../walking.txt").toPath();
		System.out.println(path1.toAbsolutePath());
		System.out.println(path2.toAbsolutePath());
		
		System.out.println(path1);
		System.out.println(path2);
		
		try {
			System.out.print(Files.isSameFile(path1,path2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		System.out.print(" "+path1.equals(path2));
		System.out.println(" "+path1.normalize().equals(path2.normalize()));
		System.out.println(path2.normalize().toAbsolutePath());
		System.out.println(path1.normalize().toAbsolutePath());
		
		// q 20
	
		final Path path = Paths.get(".").normalize(); // h1
	
		System.out.println(path.toString());
		int count = 0;
		for(int i=0; i<path.getNameCount(); ++i) {
		count++;
		}
		System.out.println(count);
		
		
	}

}
