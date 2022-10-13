package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	String columnValue;

	public String getDataFromDb(String columnName) {

		// set properties for mySQL
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String sqlUsername = "root";
			String sqlPassword = "root";

			// at work, the login credentials and url will be provided
			String sqlUrl = "jdbc:mysql://localhost:3306/april2022";
			String sqlQuery = "Select * from users;";

			// create connection to the local databse
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);

			// empowering connection reference variable to execute queries

			statement = connection.createStatement();

			// delievering query

			resultSet = statement.executeQuery(sqlQuery);

			while (resultSet.next()) {

				columnValue = resultSet.getString(columnName);
				return columnValue;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			
			if (resultSet != null) {
				
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (connection != null) {
				
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			
		}
		return columnValue;

	}

}
