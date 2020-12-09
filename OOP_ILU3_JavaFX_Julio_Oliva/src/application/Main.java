package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	public static void main(String[] args) {
	launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("!!! Hello GRACE !!!");
		Button helloButton = new Button();
		helloButton.setText("Say to 'GRACE'");
		helloButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				System.out.println("\n\tHello GRACE. How are your?");
				
			}
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(helloButton);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
		
		/**
		 *  Here it is a 'try' and 'catch' method with a 'application.css' file.
		 *  I don't now what this file does.
		 */
//		try {
//			BorderPane root = new BorderPane();
//			Scene scene = new Scene(root,400,400);
//			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//			primaryStage.setScene(scene);
//			primaryStage.show();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
	
//	public static void main(String[] args) {
//		launch(args);
//	}
}
