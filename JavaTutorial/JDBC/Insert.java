import java.sql.*;  
class Insert
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
  
	//stmt.executeUpdate("insert into emp765 values(33,'Irfan',5000)");
	//int result=stmt.executeUpdate("update emp765 where id=33");
  
	int result=stmt.executeUpdate
      ("insert into title2 values(7,'Vivek','Gupta',123,'SQL How to Program')"); 
 
//while(rs.next()) 
 
//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));  
  
System.out.println(result+"records affected");
//step5 close the connection object  
con.close();  
  
}
catch(Exception e){ System.out.println(e);}  
  
}
  
}  