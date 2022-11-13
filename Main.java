package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
/**
 * 
 * @author li_boan
 *
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 Parent root = FXMLLoader.load(getClass()
	                    .getResource("/application/Myscreen.fxml"));

	            primaryStage.setTitle("My Application");
	            primaryStage.setScene(new Scene(root));
	            primaryStage.show();
	

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
