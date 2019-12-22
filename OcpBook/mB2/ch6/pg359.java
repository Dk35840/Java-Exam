package mB2.ch6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class pg359 {

	
	public static void main(String...path) {
		int i=4;
		
		try (TurkeyCage t = new TurkeyCage()) {
			System.out.println("i run first");
		}
	}
	
	public void newApproach(Path path1, Path path2) throws IOException {
		
		//try with multiple resources and the final like   try ( ;){}; 
		try (BufferedReader in = Files.newBufferedReader(path1);
			BufferedWriter out = Files.newBufferedWriter(path2)) {
			out.write(in.readLine());
		}
	}
	
	
	// good one
	 public void multiCatch() throws SQLException, DateTimeParseException {
		 try {
	 parseData();
	 } catch (SQLException | DateTimeParseException e) {
		System.err.println(e);
	 throw e;
		 } }
	 
	 public void parseData() throws SQLException, DateTimeParseException {}
}

 class TurkeyCage implements Closeable {
 public void close() {
 System.out.println("Close gate");
 }
 }
 
 
 
