package com;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ColumnName {
 public static void main(String[] args) throws Exception {
	String driver="oracle.jdbc.driver.OracleDriver";
	String user="chaman_bharti";
	String pass="@chaman#2012";
	
	Class.forName(driver);
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",user,pass);
	java.sql.Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from add_customer");
	ResultSetMetaData md=rs.getMetaData();
	int col=md.getColumnCount();
	System.out.println("Number of Column : "+col);
	
	for(int i=1;i<=col;i++){
		String col_Name=md.getColumnName(i);
		System.out.println(col_Name);
	}
	
    
	
}
}
