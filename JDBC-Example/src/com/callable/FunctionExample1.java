package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionExample1 {
	public static void main(String[] args) throws Exception{  
		  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012");  
		  
		CallableStatement stmt=con.prepareCall("{?= call sum4(?,?)}");  
		stmt.setInt(2,10);  
		stmt.setInt(3,43);  
		stmt.registerOutParameter(1,Types.INTEGER);  
		stmt.execute();  
		  
		System.out.println(stmt.getInt(1));   
		}  

}
