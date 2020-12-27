package application;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * @author Julio_Cesar Oliva_Herrera   12/19/2020
 *
 */
public class UPPGIFT4A_Personhanteraren extends Application {
	
	

	/**
	 * @param args command line.
	 */
	public static void main(String[] args) {
		System.out.println("UPPGIFT#4:- JavaFX with Serialition. This program will"
				+ "management the people behavior:\n");
		
		Application.launch();

	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		GridPane root = new GridPane();
		
		FlowPane leftbanner = new FlowPane();
		leftbanner.setPrefWidth(100);
		
		String bgStyle = "-fx-background-color: lightblue;"
				+ "-fx-background-radius: 0%;"
				+ "-fx-background-inset: 5px;";
		leftbanner.setStyle(bgStyle);
		
		root.add(leftbanner, 0, 0, 1, 1);
		root.add(createGridPane(), 1, 0, 1, 1);
		
		Scene scene = new Scene(root, 800, 500);
		
		stage.setTitle("JavaFX GridPane LAYOUT");
		
		stage.setScene(scene);
		
		stage.show();
		
	}

	public GridPane createGridPane() {
		// TODO Auto-generated method stub
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10));
		grid.setHgap(10);
		grid.setVgap(10);
		
		Text txt = new Text("PERSON MANAGER");
		txt.setFont(Font.font("Dialog", FontWeight.BOLD, 12));
		
		grid.add(txt, 0, 0, 1, 1);
		grid.add(new Separator(), 0, 1, 3, 1);
		
		grid.add(new Label("First name"), 0, 2, 1, 1);
		grid.add(new TextField(), 1, 2, 1, 1);
		//00grid.setPrefWidth(250);
		
		grid.add(new Label("Last name"), 0, 3, 1, 1);
		grid.add(new TextField(), 1, 3, 1, 1);
				
		grid.add(new Label("Age"), 0, 4, 1, 1);
		grid.add(new TextField(), 1, 4, 1, 1);
		
		grid.add(new Separator(), 0, 5, 3, 1);
		
		FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 10, 10);
		fp.setAlignment(Pos.CENTER_RIGHT);
		fp.getChildren().addAll(
				new Button("Update"),
				new Button("Add"),
				new Button("Delete"));
		grid.add(fp, 0, 6, 3, 1);
		
//		grid.add(new Separator(), 0, 7, 3, 1);
		
		/**
		 * TEST ONLY
		 */
//		grid.add(new Label("Different us"), 1, 12, 1, 1);
		
		grid.add(new Label("Different users and projects can"
				+ " share the same compilation libraries\n"
				+ "see Help for datails"), 1, 12, 1, 1);
		
		
		return grid;
		
	}
	
	// OBS THE CODE IS NOT FINISHED.....

}
