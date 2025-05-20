//IT23157446 - B.A.L.M.U.Bogoda Arachchi 
package model;

//user details for login page
public class User {

//variables
	private String username;
	private String password;
	private String name;
	private String country;
	
	
	//getters and setters
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	//constructor
	public User(String username, String password, String name, String country) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.country = country;
	}
	
	
}

