package InterviewTests.FugetronSruthi;

import java.sql.*;

import org.testng.Reporter;
import org.testng.annotations.*;


public class JDBCTest {
	
	private Connection connection;
	 private static Statement statement;
	   private static ResultSet rs;

	    @Test
	    public void JDBCsetUp() {
	            String databaseURL = "jdbc:mysql://localhost:3306/easy";
	            String user = "";
	            String password = "";
	            connection = null;
	            try {
	                Class.forName("com.mysql.jdbc.Driver");
	                System.out.println("Connecting to Database...");
	                connection = DriverManager.getConnection(databaseURL, user, password);
	                if (connection != null) {
	                    System.out.println("Connected to the Database...");
	                }
	            } catch (SQLException ex) {
	               ex.printStackTrace();
	            }
	            catch (ClassNotFoundException ex) {
	               ex.printStackTrace();
	            }
	            
	            Reporter.log("JDBC Connection established");
	    }

	    
	      }


