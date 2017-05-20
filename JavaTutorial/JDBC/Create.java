import java.sql.*;
class Create
{
	public static void main(String[] args)throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		int result=stmt.executeUpdate("create table chaman(id int,firstname varchar2(30),lastname varchar2(30))");

		System.out.println(result+"records affected");
		con.close();
	}

}