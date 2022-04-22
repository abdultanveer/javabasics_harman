
package basics.jdbc;

import java.sql.*;

public class DemoJdbc {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/harman_db","root","");
			//Statement statement = connection.createStatement();
			String name = "abdul";
			PreparedStatement statement = connection.prepareStatement("select * from persons where FirstName = ?");    
			statement.setString(1, name);    
			ResultSet resultSet = statement.executeQuery();
			
			//ResultSet resultSet = statement.executeQuery("select  * from persons where FirstName ="+name);
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
