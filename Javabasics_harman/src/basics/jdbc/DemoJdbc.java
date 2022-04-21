
package basics.jdbc;

import java.sql.*;

public class DemoJdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harman_db","root","");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from persons");
			resultSet.next();
			int personId = resultSet.getInt("PersonID");
			String fname = resultSet.getString("FirstName");
			String lname = resultSet.getString("LastName");
			
			System.out.println(personId +"--"+fname+"--"+lname);
			statement.close();
			connection.close();

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
