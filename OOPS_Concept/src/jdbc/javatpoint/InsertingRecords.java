package jdbc.javatpoint;
import java.sql.*;
public class InsertingRecords 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		
		//stmt.executeUpdate("insert into Family values(01,'Kalim Roshan','Sailani',0.0,9955491555)");
		//stmt.executeUpdate("insert into Family values(02,'Sabila','Khatoon',0.0,9955491555)");
		stmt.executeUpdate("insert into Employee3 values(1218,'Aman',20000.00,9971044299)");
		stmt.executeUpdate("insert into Employee3 values(1219,'Naman',20000.00,9871239054)");
		//stmt.executeUpdate("insert into Family values(05,'Sahil,'Bharti',0.0,9971044299)");
		//stmt.executeUpdate("insert into Family values(06,'Nasrin,'Praveen',0.0,9955491555)");
		//stmt.executeUpdate("insert into Family values(07,'Aman,'Bharti',0.0,9955491555)");
		//stmt.executeUpdate("insert into Family values(08,'Aman,'Bharti',0.0,9955491555)");
		System.out.println("1 records inserted");
		stmt.close();
		con.close();
	}
}
