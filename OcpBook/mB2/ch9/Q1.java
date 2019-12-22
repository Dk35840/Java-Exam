package mB2.ch9;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path1 = Paths.get("/user/.././root", "../kodiacbear.txt");
	//	path1.normalize().relativize("/lion");   // it take path rather than Stirng
		Path path2= Paths.get("/lion");
		
		System.out.println(path1.normalize().relativize(path2));

		// ques 3
		//Path path = Paths.get("sloth.schedule");
		//BasicFileAttributeView attributes = Files.readAttributes(path, BasicFileAttributeView.class);
	//	if (attributes.size() > 0 && attributes.creationTime().toMillis() > 0) {
		//	attributes.setTimes(null, null, null);
		
		
		//ex 4
		Path path = Paths.get("/zoo/animals/bear/koala/food.txt");
		System.out.println(path.subpath(1,3).getName(1).toAbsolutePath());
		System.out.println("fds");
		 System.out.write('d');
		 System.out.write( 65);
 System.out.flush();
 
System.out.println("Outer class can access inner class private members");

Q1.Inner qi= new Q1().new Inner();
System.out.println(qi.a);
qi.fun();
 
 
		}
	
	class Inner{
		
		private int a=4;
		private void fun() {
			System.out.println("inner called");
		}
	}
	}

