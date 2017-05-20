package com.rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
//simple example of JdbcRowSet with event handling code.
public class JdbcRowSetEvent {
	 public static void main(String[] args) throws Exception {  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		
		//Creating and Executing RowSet  
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
		rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
		rowSet.setUsername("chaman_bharti");  
		rowSet.setPassword("@chaman#2012");  
		           
		rowSet.setCommand("select * from user420");  
		rowSet.execute();  
		
		//Adding Listener and moving RowSet
		rowSet.addRowSetListener(new MyListener());
		while (rowSet.next()) {  
                // Generating cursor Moved event  
                System.out.println("Id: " + rowSet.getString(1));  
                System.out.println("Name: " + rowSet.getString(2));  
                System.out.println("Salary: " + rowSet.getString(3));  
        }  
         
}  

}
