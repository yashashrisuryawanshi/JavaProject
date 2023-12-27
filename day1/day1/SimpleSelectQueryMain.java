package day1;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Program to fire SELECT query to get the data from DB and print the same.
public class SimpleSelectQueryMain {

	public static void main(String[] args) {
		// 1. Load the Driver
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		//String driverClassName = "oracle.jdbc.OracleDriver";
		try {
			Class.forName(driverClassName);
			System.out.println("Driver loaded.");
			
			//2. Establish Connection:
			String connectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23";
			String userId = "root";
			String password = "root";
			
			Connection dbConnection = DriverManager.getConnection(connectionUrl, userId, password);
			System.out.println("Connected to DB");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
