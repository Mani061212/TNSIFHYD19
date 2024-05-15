package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employee_db";
		String username = "root";
		String password = "Mani124?";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String Id = result.getString("Id");
			    String Name = result.getString("Name");
			    String Pno = result.getString("Pno");
			    String Email = result.getString("Email");
			 
			    String output = "employee #%d: %s - %s - %s - %s";
			    System.out.println(String.format(output, count++ , Id ,  Name, Pno , Email));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
