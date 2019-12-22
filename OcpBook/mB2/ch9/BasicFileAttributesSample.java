package mB2.ch9;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.HashMap;
import java.util.Map;

public class BasicFileAttributesSample {
	public static void main(String[] args) throws IOException {
//lastAccessTime=2019-03-23T12:01:55.439733Z, lastModifiedTime=2020-06-28T11:08:52.759Z, size=5,
		Path path = Paths.get("home/smiths.txt");
		
		Map mp = new HashMap(); 
		mp= Files.readAttributes(path,"lastModifiedTime,size,lastAccessTime");
		System.out.println(mp);
		BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);
		
		System.out.println("Is path a directory? " + data.isDirectory());
		System.out.println("Is path a regular file? " + data.isRegularFile());
		System.out.println("Is path a symbolic link? " + data.isSymbolicLink());
		System.out.println("Path not a file, directory, nor symbolic link? " + data.isOther());
		System.out.println("Size (in bytes): " + data.size());
		System.out.println("Creation date/time: " + data.creationTime());
		System.out.println("Last modified date/time: " + data.lastModifiedTime());
		System.out.println("Last accessed date/time: " + data.lastAccessTime());
		System.out.println("Unique file identifier (if available): " + data.fileKey());

		// .. means up one key
		System.out.println("A questio fo find the equal");
		Path path1 = Paths.get("home/lizard/./").resolve(Paths.get("walking.txt"));
		Path path2 = new File("home/lizard/././actions/../walking.txt").toPath();
		System.out.print(Files.isSameFile(path1, path2));
		System.out.print(" " + path1.equals(path2));
		System.out.print(" " + path1.normalize().equals(path2.normalize()));

		// . is used in the middle of a path string it just means the same directory as
		// the path was pointing to at that point.
		// creating symbolic Link links
		// .. means parent so take it
		
		try {
			Path newLink = new File("home/lizard/././actions/sub1/../symbolicLink4.txt").toPath();
			Files.createSymbolicLink(newLink, path1);
		} catch (IOException x) {
			System.err.println(x);
		} catch (UnsupportedOperationException x) {
			// Some file systems do not support symbolic links.
			System.err.println(x);
		}

		Path currentDir = Paths.get(".");
		System.out.println(currentDir.toAbsolutePath());

		// BasicFileAttributeView
		// Path path = Paths.get("/turtles/sea.txt");
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes data1 = view.readAttributes();
		FileTime lastModifiedTime = FileTime.fromMillis(data1.lastModifiedTime().toMillis() + 10000000000L);
		view.setTimes(lastModifiedTime, null, null);
	}

}