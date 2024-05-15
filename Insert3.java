package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert3 {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee_db";
		String username = "root";
		String password = "Mani124?";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (Id, Name , Pno , Email ) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    
		    statement.setString(1, "4");
		    statement.setString(2, "Anish");
		    statement.setString(3, "93470");
		    statement.setString(4, "Anish@Gmail.com"); 
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}
}
