package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class UPPGIFT4_Personhanteraren extends Application {
	
	public static void main(String[] args) {
	launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("!!! Hello Jonas !!!");
		Button helloButton = new Button();
		helloButton.setText("The message to 'Jonas'");
		helloButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				System.out.println("\nHello Jonas, I could not complete task \n"
						+ "number 4 either, because I was busy with task number 3. \n"
						+ "Now I can continue with given number 4. \n"
						+ "I know all the steps that need to be finish with task nr4. \n"
						+ "I'm sorry I go very slowly with tasks \n"
						+ "but the import it is learn the programming matter.\n");
				
			}
			
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(helloButton);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
		
	}
	
}
