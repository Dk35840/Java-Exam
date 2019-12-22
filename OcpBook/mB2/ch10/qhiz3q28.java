package mB2.ch10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class qhiz3q28 {

	protected static int j;

	public void change() {
		j = 12;
	}

	public static void main(String[] str) throws SQLException  {
		// creating a connection
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ocp-book",
		"username",
		"password");
		
		Connection conn2 = DriverManager.getConnection("jdbc:derby:zoo");
		//conn2.commit();
		// getting the statement
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate("insert into species values(10, 'Deer', 3)");
		System.out.println(result); // 1
		result = stmt.executeUpdate("update species set name = '' where name = 'None'");
		System.out.println(result); // 0
		result = stmt.executeUpdate("delete from species where id = 10");
		System.out.println(result); // 1
		
		ResultSet rs = stmt.executeQuery("select * from species");
		
		boolean isResultSet = stmt.execute("select * from species");
		if (isResultSet) {
		ResultSet rs1 = stmt.getResultSet();
		System.out.println("ran a query");
		} else {
		int result1 = stmt.getUpdateCount();
		System.out.println("ran an update");
		}
		
		// reading the data
		Map<Integer, String> idToNameMap = new HashMap<>();
		 ResultSet rs11 = stmt. executeQuery ("select id, name from species");
		 while(rs11.next()) {
		 int id = rs11. getInt (1);
		 String name = rs11. getString (2);
		 idToNameMap.put(id, name);
		 }
		 System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
	}
}
