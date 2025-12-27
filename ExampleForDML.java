package com.firstjdbcprojects;

import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ExampleForDML {

	public static void main(String[] args) {
		String jdbcurl = "jdbc:mysql://localhost:3306/Aits";
		String username = "root";
		String password = "Nikhil@Tej2006";
		
		try {
		
			Connection c = DriverManager.getConnection(jdbcurl,username, password);
			Statement s = c.createStatement();
			String retrieve = "SELECT * FROM employee";
			ResultSet result = s.executeQuery(retrieve);
			//INSERT,UPDATE,DELETE,SELECT
			
			
			//INSERT-method
			String insertData = "INSERT INTO employee(id,name,email,PhoneNumber) VALUES(1, 'NIKHIL','nikhil@gmail.com','3628561981'),(2,'TEJ','tej@gmail.com','6783058201')";
			int rowsInsertedData = s.executeUpdate(insertData);
			System.out.println(rowsInsertedData+" records inserted successfully");
			
			
			
			/*
			//UPDATE-method
			
			String updateData = "UPDATE employee SET name = 'Genius' WHERE id = 1";
			int rowsUpdatedData = s.executeUpdate(updateData);
			System.out.println(rowsUpdatedData+" records updated successfully");
			
			*/
			
			/*
            //DELETE-meethod
            String deleteData = "DELETE FROM employee WHERE id = 1";
            int deleted = s.executeUpdate(deleteData);
            System.out.println(deleted + " record deleted successfully");
			*/
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
