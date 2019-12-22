package mB2.ch10;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;


public class WhizQ6 {

	public static void main(String[] args) throws SQLException {
		RowSetFactory myrsf= RowSetProvider.newFactory();
		
JdbcRowSet jrs = myrsf.createJdbcRowSet();
	}

}
