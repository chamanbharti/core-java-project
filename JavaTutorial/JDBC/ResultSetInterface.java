import java.sql.*;

class ResultSetInterface
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=stmt.executeQuery("select * from title2");
		//getting the record of 3rd row
		rs.absolute(2);
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		con.close();
	}

}