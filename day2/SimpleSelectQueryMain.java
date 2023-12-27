package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Program to fire SELECT query to get the data from DB and print the same.
public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// 1. Load the Driver
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		//String driverClassName = "oracle.jdbc.OracleDriver";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded.");
			
			//2. Establish Connection:
			String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false";
			String userId = "root";
			String password = "root";
			
			dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connected to DB");
			
			//Obtaining Statement
			stmt = dbConnection.createStatement();
			
			//Executing SQL Query
			String sqlQuery = "select rest_name, rest_cuisine, rest_branches from restaurant_master";
			 rs = stmt.executeQuery(sqlQuery);
			
			while(rs.next()) {
				//Reading the values
				String name = rs.getString(1);
				String cuisine = rs.getString(2);
				int branchCount = rs.getInt(3);
				System.out.println(name + ", " + cuisine + "," + branchCount);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				//Closing all the resources
				rs.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
