package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Register_Form.fxml"));
            BorderPane root = loader.load();

            Register_FormController controller = loader.getController();

            if (controller != null) {
                // Call initialize only if the controller is not null
                controller.initialize();
            } else {
                System.out.println("Controller is null.");
            }

            // Set up the stage
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Registration Form");
            primaryStage.getIcons().add(new Image("raji_pic.png"));
            // Show the stage
            primaryStage.show();

            // Initialize the database connection
            DB_conn DB = new DB_conn();
            DB.getConnection();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
