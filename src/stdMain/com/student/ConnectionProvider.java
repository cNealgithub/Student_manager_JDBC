package stdMain.com.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	static Connection cn;
	//method for establishing connection
	public static Connection create() {
		//use try catch to handle upcomming exception
		try {
			//1) Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2) create connection
			String user = "yur username";
			String password = "//your password";
			String url = "jdbc:mysql://localhost:3306/your db name";
			
			cn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cn;
	}

}
