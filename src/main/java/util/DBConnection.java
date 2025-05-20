package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton Design Pattern is used here ensuring only one Database can be connected

public class DBConnection extends CommonUtil{
	
	private static Connection connection;
	
	private DBConnection() {
		
	};
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		if(connection == null || connection.isClosed()) {
			
			Class.forName(properties.getProperty(CommonConstants.DRIVER_NAME));
			
			connection = DriverManager.getConnection(properties.getProperty(CommonConstants.URL),
					properties.getProperty(CommonConstants.USERNAME), properties.getProperty(CommonConstants.PASSWORD));
					
		}
		
		return connection;
	}

}
