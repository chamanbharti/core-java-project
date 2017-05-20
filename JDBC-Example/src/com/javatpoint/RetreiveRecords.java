package com.javatpoint;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//JdbcRowSet without event handling code.
public class RetreiveRecords 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from user420");
		//rs.close();//Exception in thread "main" java.sql.SQLRecoverableException: Closed Resultset: next
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				//rs.close();//Exception in thread "main" java.sql.SQLRecoverableException: Closed Resultset: next
			}
			rs.close();
			stmt.close();
			con.close();
		}
}
