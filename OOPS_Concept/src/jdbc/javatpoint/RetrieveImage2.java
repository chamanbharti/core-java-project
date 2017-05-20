package jdbc.javatpoint;

import java.sql.*;  
import java.io.*;  
public class RetrieveImage2 
{  
	public static void main(String[] args) 
	{  
			try
			{  
				Class.forName("oracle.jdbc.driver.OracleDriver"); 
				Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
			PreparedStatement ps=con.prepareStatement("select * from imagetable");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next())
			{//now on 1st row  
				              
				Blob b=rs.getBlob(2);//2 means 2nd column data  
				byte barr[]=b.getBytes(4,(int)b.length());//1 means first image  
				              
				FileOutputStream fout=new FileOutputStream("d:\\chaman.jpg");  
				fout.write(barr);  
				              
				fout.close();  
			}//end of if  
			System.out.println("ok");  
			              
			con.close();  
			}
	catch (Exception e) {e.printStackTrace();  }  
	}  
} 