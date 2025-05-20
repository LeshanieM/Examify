//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;



public class LoginUtil {
	//instance variables can be used within the clz
	//creating a database connection
	private static Connection connection;
	private static Statement stmt;
	private static ResultSet rs  = null;

	public static boolean LoginValidate(String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			
			connection = DBConnection.getConnection();
			stmt = connection.createStatement();
			
			
			String Sql = "select * from user where username='"+username+"' AND password ='"+password+"'";
			rs = stmt.executeQuery(Sql);
			
			if(rs.next()) {
				
				isSuccess = true;
				
			}else {
				
				isSuccess = false;
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		return isSuccess;
	}

	
	public static List<User> getLoginUser(String username){
		
		ArrayList<User> user = new ArrayList<>();
		
		try {
			
			connection = DBConnection.getConnection();
			
			
			String Sql = "select * from user where username='"+username+"'";
			
			rs = stmt.executeQuery(Sql);
			
			while(rs.next()) {
				

				String Username = rs.getString(1);
				String Password = rs.getString(2);
				String name = rs.getString(3);
				String country = rs.getString(4);
				
				
				User userList = new User(Username,Password,name,country);
				user.add(userList);
			}
			
		}catch(Exception e) {
			
		}
		
		return user;
	}
	
}


