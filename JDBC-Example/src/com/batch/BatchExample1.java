package com.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExample1 {
	public static void main(String args[]){  
		try{  
		  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012");  
		
		con.setAutoCommit(false); 
		Statement stmt=con.createStatement();  
		stmt.addBatch("insert into user420 values(302,'abhi',40000)");  
		stmt.addBatch("insert into user420 values(303,'umesh',50000)");  
		  
		stmt.executeBatch();//executing the batch  
		  
		con.commit();  
		con.close();  
		}
		catch(Exception e){System.out.println(e);}
		System.out.println("Record inserted successfully");
	}
}
