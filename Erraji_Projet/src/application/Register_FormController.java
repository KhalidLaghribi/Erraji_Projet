package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import application.ImplementationDAO.UserDaolmp;
import application.model.User;

public class Register_FormController {
	@FXML
	private  TextField tf_first_Name ; 
	
	@FXML
	private  TextField tf_last_Name ; 
	
	@FXML
	private  TextField tf_email; 
	
	@FXML
	private  TextField tf_password;
	
	@FXML
	
	private Label tf_error ; 
	
	private UserDaolmp userDao = new UserDaolmp();
	
	public void initialize() {
	    // Initialization logic (if needed)
	    System.out.println("Controller is initialized.");
	}
	
	private void showAlert(String message) {
		userDao.getConnection();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registration Information");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
	
	@FXML
    private void handleRegisterButton() {
        String firstName = tf_first_Name.getText();
        String lastName = tf_last_Name.getText();
        String email = tf_email.getText();
        String password = tf_password.getText();
        
        
        
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
            showAlert("All fields must be filled in.");
            return;
        }   
        User user = new User(firstName, lastName, email, password);
        
        boolean registrationSuccess = userDao.insert_User(user);

        if (registrationSuccess) {
            showAlert("Registration successful!");
            // You can add further actions after successful registration
        } else {
            showAlert("Registration failed. Please try again.");
        }
	}

    
}
