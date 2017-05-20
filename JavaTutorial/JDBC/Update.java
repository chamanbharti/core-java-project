import java.sql.*;
class Update
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("update title2 set firstname='Naman' where firstname='Nman'");

		System.out.println(result+" records affected");
		con.close();
	}

}