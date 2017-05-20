package com.javatpoint;

import java.sql.*; 
import java.io.*; 
import java.awt.*;   
public class RetrieveImage extends Frame 
{ 
	public static void main(String args[], Object Blob)throws Exception 
	{ 
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con=DriverManager.getConnection("jdb:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
			/*Statement stat= con.createStatement();   
			ResultSet rs=stat.executeQuery("select *from Image");   
			rs.next(); 
			InputStream is = rs.getBinaryStream(1); // 1 indicates column number in marriage table where image exists   
			FileOutputStream fos=new FileOutputStream("Temp.txt");   
			int k; 
				while((k=is.read()) != -1) 
				{ 
					fos.write(k); 
				}   
			fos.close(); 
			rs.close(); 
			stat.close(); 
			is.close(); 
			con.close();   
			Frame f = new RetrieveImage(); 
			f.setSize(300, 350); 
			f.setVisible(true); */
			PreparedStatement ps=con.prepareStatement("select * from imagetable");
			ResultSet rs=ps.executeQuery();
			if(rs.next())//now on 1st row
			{
				Blob b=rs.getBlob(2);//2 means column data
				byte barr[]=b.getBytes(1, (int)b.length());//1 means 1 image
				FileOutputStream fos=new FileOutputStream("F:/Chaman Bharti/My Photo/chamanb.jpg");
				fos.write(barr);
				fos.close();
			}//end of if
				System.out.println("OK");
				
		
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		}
	 
		/*public void paint(Graphics g)
			{ 
				Image img1 = Toolkit.getDefaultToolkit().getImage("Temp.txt"); 
				g.drawImage(img1, 50, 100, this); 
			} */
} 

