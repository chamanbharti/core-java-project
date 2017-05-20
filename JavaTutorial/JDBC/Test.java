import java.sql.*;  
class Test
{  
public static void main(String args[])
{  
try
{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
ResultSet rs=stmt.executeQuery("select * from title2"); 
 
while(rs.next()) 
 
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5));  
  
//step5 close the connection object  
con.close();  
  
}
catch(Exception e){ System.out.println(e);}  
  
}
  
}  