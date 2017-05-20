package jdbc.javatpoint;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementCreateExample 
{
	public static void main(String[] args) 
	{
		createDbUserTable();
	}
	
	private static void createDbUserTable()
	{
		String createTableSQL = "CREATE TABLE DBUSER3("
				+ "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, "
				+ "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
				+ ")";
		
		Connection conn=null;
		Statement statement=null;
		
		try 
		{
			conn=OracleConnection.getOracleConnection();
			statement=conn.createStatement();
			statement.execute(createTableSQL);
			
			System.out.println("Table \"dbuser\" is created!");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
					if (statement != null) 
					{
						statement.close();
					}
	 
					if (conn != null) 
					{
						conn.close();
					}
			}
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
	}
}
