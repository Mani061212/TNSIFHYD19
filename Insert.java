package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee_db";
		String username = "root";
		String password = "Mani124?";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (Id, Name , Pno , Email ) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		   /* statement.setString(1, "1");
		    statement.setString(2, "Mani");
		    statement.setString(3, "63050");
		    statement.setString(4, "mani@Gmail.com");
		    statement.setString(1, "2");
		    statement.setString(2, "Shankar");
		    statement.setString(3, "73311");
		    statement.setString(4, "Shankar@Gmail.com"); */
		    statement.setString(1, "3");
		    statement.setString(2, "Aarsrith");
		    statement.setString(3, "73370");
		    statement.setString(4, "Aarsrith@Gmail.com");
		   /* statement.setString(1, "4");
		    statement.setString(2, "Anish");
		    statement.setString(3, "93470");
		    statement.setString(4, "Anish@Gmail.com"); */
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}