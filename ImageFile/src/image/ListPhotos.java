package image;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListPhotos extends HttpServlet {
	   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
        	 //connect to oracle
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
    		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","chaman_bharti","@chaman#2012");
    		 PreparedStatement ps = con.prepareStatement("select * from photos");
             ResultSet rs = ps.executeQuery();
            out.println("<h1>Photos</h1>");
            while ( rs.next()) {
                  out.println("<h4>" + rs.getString("title") + "</h4>");
                  out.println("<img width='600' height='600' src=DisplayPhoto?id=" +  rs.getString("id") + "></img> <p/>");
            }

            con.close();
        }
        catch(Exception ex) {

        }
        finally { 
            out.close();
        }
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }
}