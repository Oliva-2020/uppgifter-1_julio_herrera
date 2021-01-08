package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * @author Julio_Cesar Oliva_Herrera   12/19/2020
 *
 */
public class UPPGIFT4A_Personhanteraren extends Application {
	
	private final TableView<Person> table = new TableView<>();
	private final ObservableList<Person> personManagerList = FXCollections.observableArrayList();
//	private int String;
	
	// I supose to call the class 'Person'
//	Person persona = new Person();
	
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
		
//		Person persona = new Person();
		
		/**
		 * Object 'root' that call 'GridPane' class.
		 */
		GridPane root = new GridPane();
		
		/**
		 * Object 'leftbanner' that call 'FlowPane' class.
		 */
		FlowPane leftbanner = new FlowPane();
		leftbanner.setPrefWidth(100);
		
		String bgStyle = "-fx-background-color: lightblue;"
				+ "-fx-background-radius: 0%;"
				+ "-fx-background-inset: 5px;";
		leftbanner.setStyle(bgStyle);
		
		root.add(leftbanner, 0, 0, 1, 1);
		root.add(createGridPane(), 1, 0, 1, 1);
		
		//Scene scene = new Scene(root, 800, 500);
		Scene scene = new Scene(root, 800, 800);
		
		stage.setTitle("JavaFX GridPane LAYOUT");
		
		/**
		 * The call of 'setTableimage' method witch is that size of the table.
		 */
//		setTableimage();
		
		/**
		 * To fill in the list of person.
		 */
//		fillTablepersonManagerList();
//		table.setItems(personManagerList);
		
		// TODO
		final Label label = new Label("");
		label.setFont(new Font("Arial", 20));
		
		table.setEditable(true);
		
		TableColumn firstNameCol = new TableColumn("First Name");
		firstNameCol.setMinWidth(100);
		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		// TODO
		TableColumn lastNameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(100);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		// TODO
		TableColumn aGeCol = new TableColumn("Age");
		aGeCol.setMinWidth(100);
		aGeCol.setCellValueFactory(new PropertyValueFactory<>("age"));
		
		table.setItems(personManagerList);
		table.getColumns().addAll(firstNameCol, lastNameCol, aGeCol);
		
		// TODO
		final TextField addFirstName = new TextField();
		addFirstName.setPromptText("First Name");
		addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
		final TextField addLastName = new TextField();
		addLastName.setMaxWidth(lastNameCol.getPrefWidth());
		addLastName.setPromptText("Last Name");
		// TODO
		final TextField addAge = new TextField();
		addAge.setMaxWidth(aGeCol.getPrefWidth());
		addAge.setPromptText("Age");
		
//		final 
		
		stage.setScene(scene);
		
		stage.show();
		
	}

//	private void fillTablepersonManagerList() {
//		// This is the list of the people in the list.
//		personManagerList.addAll(new Person(1, "Maria Andersson"),
//								 new Person(2, "Lars Joghansso"),
//								 new Person(3, "Margareta Karlsson"),
//								 new Person(4, "Anders Nilsson"),
//								 new Person(5, 	"Eva Johan"));
	
//	}
	
	/**
	 * This 'setTableimage' method is with Table mutter but still alone 
	 */
	private void setTableimage() {
		// The size of table
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table.setPrefWidth(600);
		table.setPrefHeight(600);		
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
		//grid.setPrefWidth(250);			// To set 'TextField' more narrow(estrecho)
		//grid.setPrefWidth(1000);			// Even so does not increase to much that to do is
											// take off the blue stripe.
		//grid.setMaxWidth(200);			// To set more narrow 'TextField'
		
		
		grid.add(new Label("Last name"), 0, 3, 1, 1);
		grid.add(new TextField(), 1, 3, 1, 1);
				
		grid.add(new Label("Age"), 0, 4, 1, 1);
		grid.add(new TextField(), 1, 4, 1, 1);
		
		grid.add(new Separator(), 0, 5, 3, 1);
		
		FlowPane fp = new FlowPane(Orientation.HORIZONTAL, 10, 10);
		fp.setAlignment(Pos.CENTER_RIGHT);			// That start from the center to the right
													// side.
		//fp.setAlignment(Pos.BASELINE_RIGHT);			// It is the same as 'Pos.CENTER_RIGHT'
		fp.getChildren().addAll(
				new Button("Update"),
				new Button("Add"),
				new Button("Delete"));
		grid.add(fp, 0, 6, 3, 1);
		
//		grid.add(new Separator(), 0, 7, 3, 1);
		
		/**
		 * Here should be started the 'Table'
		 */
//		final Button a
		
		/**
		 * TEST ONLY
		 */
//		grid.add(new Label("Different us"), 1, 12, 1, 1);
		
//		grid.add(new Label("Different users and projects can"
//				+ " share the same compilation libraries\n"
//				+ "see Help for datails"), 1, 12, 1, 1);

//		grid.add(new Label("Different users and projects can"
//		+ " share the same compilation libraries\n"
//		+ "see Help for datails"), 1, 50, 1, 1);			// , 1, 12, 1, 1) Normal. This is
															// This is for keep the 
															// the 'TextField' longer.
		
		
		
		return grid;
		
	}
	
	// OBS THE CODE IS NOT FINISHED.....

}
