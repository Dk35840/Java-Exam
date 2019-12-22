package whiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DQ22 {

	public static void main1(String[] args) {
		
		
		
		whizlab<Long> my = new whizlab<Long>();
		// TODO Auto-generated method stub
		IntStream ds = IntStream.of(1, 2, 2, 4);
//Stream s= ds.boxed().map(Integer::toString);  
//System.out.println(s.findFirst());
		System.out.println(Integer.toString(47));
		System.out.println(Integer.compare(1, 0));

		Comparator.comparing(e -> ((Integer) e).intValue());

	}
 
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		Connection conn1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ocp-book",
				"username",
				"password");
		
		String url = "jdbc:derby:zoo";
		try (Connection conn = DriverManager.getConnection(url);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select name from animal")) {
		while (rs.next())
		System.out.println(rs.getString(1));
		
		
		
		}
	}

}
