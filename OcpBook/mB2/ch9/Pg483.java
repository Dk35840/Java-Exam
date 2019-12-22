package mB2.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Pg483 {

	public static void main(String[] args) {
		// pg 180

		try {
			final Path path = Paths.get("home/sharks.txt");
			System.out.println(path.toRealPath());
			System.out.println(Files.getLastModifiedTime(path).toMillis());
//get date time
			ZonedDateTime dateTime = Instant.ofEpochMilli(Files.getLastModifiedTime(path).toMillis())
		            .atZone(ZoneId.of("Asia/Kolkata"));
			String formatted = dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
			System.out.println("formatted string: "+formatted);
			Files.setLastModifiedTime(path, FileTime.fromMillis(System.currentTimeMillis()-553325042939L));
			System.out.println(Files.getLastModifiedTime(path).toMillis());
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		// pg 483
		Path path13 = Paths.get("pandas", "cuddly.png");
		try {
			// Read owner of file
			Path path = Paths.get("home/feathers.txt");
			System.out.println(Files.getOwner(path).getName());
			// Change owner of file
			UserPrincipal owner = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("dhku02");
			// UserPrincipal owner1 =
			// path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("sagu02");
			Files.setOwner(path, owner);
			// Files.setOwner(path, owner1);
			// Output the updated owner information
			System.out.println(Files.getOwner(path).getName());
		} catch (IOException e) {
			// Handle file I/O exception...
			System.out.println(e.getMessage());
		}

	}

}
