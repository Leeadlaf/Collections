/*
 * Name: 	DatabaseAccess.java
 * Author: 	Kuni Scissum
 * Vers: 	1.0.0 - initial coding - kjs
 * Notes: 	Code works only on server local to MySQL database. To open remote access, change DB_URL to 
 * 			71.45.66.15:3306/ee433
 * 		   -Must have JDBC Connector in TOMCAT/lib folder. Please refer to README.
 * Credits: Code found at http://www.tutorialspoint.com/servlets/servlets-database-access.htm.
 * 			Used to establish connection to MySQL database for EE433 Collections Project.
 */

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.sql.*;
 
public class DatabaseAccess extends HttpServlet{
    
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // JDBC driver name and database URL
      final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
      final String DB_URL="jdbc:mysql://localhost:3306/ee433";

      //  Database credentials
      final String USER = "root";
      final String PASS = "Collectors";

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
//      String title = "Database Result";
//      String docType =
//        "<!doctype html public \"-//w3c//dtd html 4.0 " +
//         "transitional//en\">\n";
//         out.println(docType +
//         "<html>\n" +
//         "<head><title>" + title + "</title></head>\n" +
//         "<body bgcolor=\"#f0f0f0\">\n" +
//         "<h1 align=\"center\">" + title + "</h1>\n");
      Connection conn = null;
	Statement stmt = null;
	try{
         // Register JDBC driver
         Class.forName("com.mysql.jdbc.Driver");

         // Open a connection
         conn = DriverManager.getConnection(DB_URL,USER,PASS);

         // Execute SQL query
         stmt = conn.createStatement();
         String sql;
         sql = "SELECT message FROM example";
         ResultSet rs = stmt.executeQuery(sql);

         // Extract data from result set
         while(rs.next()){
            //Retrieve by column name
//            int id  = rs.getInt("id");
//            int age = rs.getInt("age");
//            String first = rs.getString("first");
//            String last = rs.getString("last");
        	 String message = rs.getString("message");

            //Display values
//            out.println("ID: " + id + "<br>");
//            out.println(", Age: " + age + "<br>");
//            out.println(", First: " + first + "<br>");
//            out.println(", Last: " + last + "<br>");
        	 out.println(message);
         }
         out.println("</body></html>");

         // Clean-up environment
         rs.close();
         stmt.close();
         conn.close();
      }catch(SQLException se){
         //Handle errors for JDBC
         se.printStackTrace();
      }catch(Exception e){
         //Handle errors for Class.forName
         e.printStackTrace();
      }finally{
         //finally block used to close resources
         try{
            if(stmt!=null)
               stmt.close();
         }catch(SQLException se2){
         }// nothing we can do
         try{
            if(conn!=null)
            conn.close();
         }catch(SQLException se){
            se.printStackTrace();
         }//end finally try
      } //end try
   }
} 
