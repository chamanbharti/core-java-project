package com.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012"); 
		con.setAutoCommit(true);
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate("insert into users values('Chaman Bharti','chaman.bharti@gmail.com','India','123')");  
		stmt.executeUpdate("insert into users values('Sahil Bharti','sahil.bharti@gmail.com','India','123')");  
		con.commit();
		con.close();
		System.out.println("data stored successfully");
	}

}
