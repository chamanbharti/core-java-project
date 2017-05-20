package Chapter28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Displayauthors 
{
	//database url
	//static final String database_url="oracle.jdbc.driver.OracleDriver";
	//Class.forName("oracle.jdbc.driver.OracleDriver");
		//launch the application
		public static void main(String[] args) throws Exception
			{
			Connection connection=null;//manages connection
			Statement statement=null;//query statement
			ResultSet resultSet=null;//manages results
			//connect to database books and query database
			try
			{
				//load driver
				//Class.forName("oracle.jdbc.driver.OracleDriver");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//establish connection to database
				connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chaman_bharti","@chaman#2012");
				//create statement for querying database
				statement=connection.createStatement();
				//query database
				resultSet=statement.executeQuery("Select authorid,FirstName,LastName From title2");
				//process query results
				ResultSetMetaData metaData=resultSet.getMetaData();
				int numberOfColumn=metaData.getColumnCount();
				System.out.println("Title2 Table of Books Database:\n");
				for (int i = 1; i<=numberOfColumn ; i++) 
				{
					System.out.printf("%-8s\t",metaData.getColumnName(i));
					System.out.println();
				}
				
				while (resultSet.next()) 
				{
					for (int i = 1; i <= numberOfColumn; i++) 
					{
						System.out.printf("%-8s\t",resultSet.getObject(i));
						System.out.println();
					}
					
				}//end while
			}//end try
			
			catch(SQLException sqlException)
			{
				sqlException.printStackTrace();
			}//end catch
			
			finally
			{
				try
				{
					resultSet.close();
					statement.close();
					connection.close();
				}//end try
				
				catch(Exception exception)
				{
					exception.printStackTrace();
				}//end catch
			}//end finally
		
	}
	
}
