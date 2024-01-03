package application.ImplementationDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import application.DAO.UserDAO;
import application.model.User;

public class UserDaolmp implements UserDAO {
	
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/erraji_projet";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";
    
    
    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
            System.out.println("succes");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    
	@Override
	public boolean insert_User(User user) {
		String INSERT_USER_SQL = "INSERT INTO users" +
		        "  (First_name,Last_name,email,password) VALUES " +
		        " (?, ?, ?,?);";
		 try (
		        	Connection connection = getConnection();
		            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL))
		        {
		            preparedStatement.setString(1, user.getFirst_Name());
		            preparedStatement.setString(2,user.getLast_name());
		            preparedStatement.setString(3, user.getEmail());
		            preparedStatement.setString(4, user.getPassword());
		            preparedStatement.executeUpdate();
		            
		            return true ;
		            
		        } catch (SQLException e) {
		            e.printStackTrace();
		            return false;
		        }
		
	}

	@Override
	public User findUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int Id) {
		// TODO Auto-generated method stub
		
	}

}
