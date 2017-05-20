package com.javatpoint;
import java.sql.*;

public class CreateTable 
{
	public static void main(String[] args) throws Exception
	{
		Connection con=null;
		Statement stmt=null;
		
		try
		{
			//Load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//establish the connection
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
			//create statement object
			stmt=con.createStatement();
			//send sql command
			stmt.executeUpdate("create table Employee3(empid number,empname varchar2(20),empSal number(9,2),empContact number(15,0) )");
			System.out.println("Table Created");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver not Found"+e);
		}
		catch(SQLException e) 
		{ 
			System.err.println("Some problem in creating connection. " + e); 
		} 
		
		finally //close the dbms connection
		{
			try
			{
				stmt.close();
				con.close();	
			}
			catch(SQLException e)
			{
				System.err.println("Unable to close"+e);
			}
		}
		
	}
}
