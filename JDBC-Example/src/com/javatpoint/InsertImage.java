package com.javatpoint;

import java.sql.*; import java.io.*; 
public class InsertImage 
{ 
	public static void main(String args[]) throws Exception 
	{ 
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012"); 
			//PreparedStatement pst=con.prepareStatement("insert into Image values(?,?)");   
			//FileInputStream fis = new FileInputStream("F:/Chaman Bharti/My Photo/chaman.jpg"); 
			//pst.setBlob(1, fis, fis.available());   
			//pst.executeUpdate();   
			//System.out.println("Image Inserted");   
			//fis.close(); 
			//pst.close(); 
			//con.close(); 
			/*File file = new File("F:/Chaman Bharti/My Photo/chamanbharti.jpg"); 
			FileInputStream fis = new FileInputStream(file); 
			int len = (int)file.length();
			//len = (int)file.length();
			String query = ("insert into Image(?,?)"); 
			//query = ("insert into Image(?,?)"); 
			PreparedStatement pst=con.prepareStatement("insert into Image values(?,?)"); 
			pst.setInt(1, len); 
			// Method used to insert a stream of bytes 
			pst.setBinaryStream(2, fis, len); 
			pst.executeUpdate();
			System.out.println("Image Inserted");
			fis.close(); 
			pst.close(); 
			con.close();*/
			PreparedStatement ps=con.prepareStatement("insert into imagetable values(?,?)");
			ps.setString(1, "chamanbharti");
			FileInputStream fis=new FileInputStream("F:/Chaman Bharti/My Photo/bharti.jpg");
			ps.setBinaryStream(2,fis,fis.available());
			int i=ps.executeUpdate();
			System.out.println(i+" records affected");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
} 
	
}
