import java.sql.*;  
class Delete
{  
	public static void main(String args[])throws Exception
	{  
	  try
	  {  
	   //step1 load the driver class  
	   Class.forName("oracle.jdbc.driver.OracleDriver");  
  
	   //step2 create  the connection object  
	   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012");  
  
	//step3 create the statement object  
	Statement stmt=con.createStatement();  
  
	int result=stmt.executeUpdate("delete from title2 where authorid=7"); 
 
  
System.out.println(result+" records affected");
//step5 close the connection object  
con.close();  
  
}
catch(Exception e){ System.out.println(e);}  
  
}
  
}  