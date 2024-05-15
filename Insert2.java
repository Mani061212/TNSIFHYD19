package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert2 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee_db";
		String username = "root";
		String password = "Mani124?";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (Id, Name , Pno , Email ) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		
		    statement.setString(1, "3");
		    statement.setString(2, "Aarsrith");
		    statement.setString(3, "73370");
		    statement.setString(4, "Aarsrith@Gmail.com");
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
