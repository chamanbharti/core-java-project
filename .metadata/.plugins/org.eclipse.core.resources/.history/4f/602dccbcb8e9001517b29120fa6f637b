package com.rowset;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
//simple example of JdbcRowSet without event handling code.
public class JdbcRowSetInsert  {
	
	public static void main(String [] args) throws Exception{
	    try {
	    	
	    	Class.forName("oracle.jdbc.driver.OracleDriver");  

	// Get a new JdbcRowSet object with the default implementation
	      JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet();

	// Set the connection URL for the DriverManager
	      jrs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
	      jrs.setUsername("chaman_bharti");  
	      jrs.setPassword("@chaman#2012");

	// Set a SQL statement with parameters
	      jrs.setCommand("select * from user420");

	// Connect and run the statement
	      jrs.execute();

	// Move to the insert row
	      jrs.moveToInsertRow();

	// Set column values and insert
	      jrs.updateInt("ID_NO",500);
	      jrs.updateString("NAME", "PALAK GOYAL");
	      jrs.updateInt("SALARY", 560000);
	      jrs.insertRow();
	 
	// Repeat for another row
	      jrs.updateInt("ID_NO",501);
	      jrs.updateString("NAME", "PALAK BHARTI");
	      jrs.updateInt("SALARY", 560000);
	      jrs.insertRow();

	      System.out.println("2 rows inserted.");
	      
	// Close resource
	      jrs.close();
	    } catch (Exception e) {
	      System.err.println("Exception: "+e.getMessage());
	    }
	  }

}
