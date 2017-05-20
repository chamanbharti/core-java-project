package jdbc.javatpoint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.sun.imageio.plugins.common.InputStreamAdapter;

public class KeyboardInsert 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		Statement stmt=con.createStatement();
		//keyboard input
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee ID:");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Name:");
		String name=br.readLine();
		System.out.println("Enter Employee Salary:");
		double salary=Double.parseDouble(br.readLine());
		stmt.executeUpdate("insert into Employee3 values("+id+",'"+name+"',"+salary+")");
		System.out.println(name + " record inserted");   
		stmt.close(); 
		con.close(); 
	}

}
