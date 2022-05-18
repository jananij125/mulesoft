package com.janani.jdbc;

import java.sql.*;

public class JDBC {
	public static void main(String[] args)throws SQLException{
		
		String username ="root";
		String password ="root";
		String query ="Select * from Movies WHERE actor=\"abc\" ";
		String url= "jdbc:mysql://localhost:3306/?user=root"
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			
			Connection con = DriverManager.getConnection(url,username,password);
			Statement statement = con.createStatement();
			ResultSet result = statement.executeQuery(query);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
