package com.javatpoint;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class OracleJDBC2
{
	public static void main(String[] args)
	{
		System.out.println("......Oracle JDBC Connection Testing.......");
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Where is your Oracle JDBC Driver?");
			//e.printlnStackTrace();
			return;
		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection=null;
		
		try
		{
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		}
		catch(SQLException e)
		{
			System.out.println("Connection Failed! Check output console");
			//e.printlnStackTrace();
			return;
		}

		if(connection!=null)
		{
			System.out.println("You made it, take control your database now!");

		}

		else

		 {
			System.out.println("Failed to make connection!");
		 }
	}

}