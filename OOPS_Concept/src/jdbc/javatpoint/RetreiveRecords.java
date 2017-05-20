package jdbc.javatpoint;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetreiveRecords 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from employee3");
		
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3)+"\t"+rs.getLong(4));
			}
			rs.close();
			stmt.close();
			con.close();
		}
}
