package com.transaction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction2 {
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012"); 
			con.setAutoCommit(false);
			
			PreparedStatement ps=con.prepareStatement("insert into user420 values(?,?,?)");  
			  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			while(true){
				System.out.println("Enter ID_NO: ");
				String s1=br.readLine();
				int id=Integer.parseInt(s1);
				
				System.out.println("Enter Name: ");
				String name=br.readLine();
				
				System.out.println("Enter Salary: ");
				String s3=br.readLine();
				int salary=Integer.parseInt(s3);
				
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, salary);
				ps.executeUpdate();
				
				System.out.println("commit/rollback");  
				String answer=br.readLine();
				if(answer.equals("commit")){
					con.commit();
				}
				if(answer.equals("rollback")){
					con.rollback();
				}
				
				System.out.println("Want to add more records y/n");
				String ans=br.readLine();
				if(ans.equals("n")){
					break;
				}
			}
			con.commit();  
			System.out.println("record successfully saved");  
			  
			con.close();//before closing connection commit() is called  
			System.out.println("data stored successfully");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
