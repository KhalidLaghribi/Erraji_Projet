package application.model;

public class User {
	
	private int ID;
	private String first_Name;
	private String last_name;
	private String email;
	private String password;
	
	
	public User(String first_Name, String last_name, String email, String password) {
		super();
		this.first_Name = first_Name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getFirst_Name() {
		return first_Name;
	}


	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
