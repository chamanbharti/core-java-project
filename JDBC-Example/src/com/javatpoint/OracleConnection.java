package com.javatpoint;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection 
{
	public static Connection getOracleConnection() 
	{
		System.out.println("-------- Oracle JDBC Connection Testing ------");
		
		Connection conn=null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch (ClassNotFoundException e) 
		{
			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
		}
		
		System.out.println("Oracle JDBC Driver Registered!");
		
		
		try 
		{
				conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
		}
		catch (SQLException e) 
		{
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}
		
		if(conn !=null)
		{
			System.out.println("You made it, take control your database now!");
		}
		else
		{
			System.out.println("Failed to make connection!");
		}
		
		return conn;
	}
}
