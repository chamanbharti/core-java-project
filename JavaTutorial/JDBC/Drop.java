import java.sql.*;

class Drop
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("drop table title");

		System.out.println(result+" record affected");
		con.close();
	}

}