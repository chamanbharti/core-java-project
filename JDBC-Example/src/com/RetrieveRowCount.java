package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveRowCount {
	public static void main(String[] args) throws Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String user="chaman_bharti";
		String pass="@chaman#2012";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=st.executeQuery("select * from add_customer");
		
		rs.last();
		int count=rs.getRow();
		rs.beforeFirst();
	}

}
