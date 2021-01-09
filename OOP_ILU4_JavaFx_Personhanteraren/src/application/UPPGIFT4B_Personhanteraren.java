package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.Stage;

/**
 * @author Julio_Cesar Oliva_Herrera   12/19/2020
 *
 */
public class UPPGIFT4B_Personhanteraren extends Application {
	
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
		
		/**
		 * This is to set 'Stage' 'SelectionModel'. It is an abstract class used by UI controls 
		 * to provide a consistent API for maintaining selection.
		 * WHAT DO: The type of the 'item' contained in the 'control' that can be selected.
		 */
		TableViewSelectionModel tsm = table.getSelectionModel();
		tsm.setSelectionMode(SelectionMode.MULTIPLE);
		/**
		 * This is 'scene' object belong to Table.
		 */
//		Scene scene = new Scene(new Group());			// [NONEED] Does nothing.
		
		stage.setTitle("JavaFX GridPane and Table LAYOUT");	  	// §§§:-Belongs to TABLE Layout.-:§§§
		
		/**
		 * This is 'stage' object belongs to TABLE.			// §§§:-Belongs to TABLE Layout.-:§§§ 
		 */
		stage.setWidth(800);
		stage.setHeight(800);
		
		/**
		 * This is to confirm that table appear.			 // §§§:-Belongs to TABLE Layout.-:§§§
		 */
		table.setEditable(true);
		
		/**
		 * To set the first column.							// §§§:-Belongs to TABLE Layout.-:§§§
		 */
		TableColumn firstNameCol = new TableColumn("Fist Name");
		firstNameCol.setMaxWidth(100);		
		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		/**
		 * TO SET the second column.						// §§§:-Belongs to TABLE Layout.-:§§§
		 */
		TableColumn lastNameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(100);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

		/**
		 * TO SET the second column.						// §§§:-Belongs to TABLE Layout.-:§§§
		 */
		TableColumn aGeCol = new TableColumn("Age");
		aGeCol.setMinWidth(100);
		aGeCol.setCellValueFactory(new PropertyValueFactory<>("aGe"));

		
		/**
		 * This is only a check control for resize of column and data.
		 * 															//§§§:-Belongs to TABLE Layout.-:§§§
		 */
		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table.setPlaceholder(new Label("No visible columns and/or data exist."));
		
		// TODO GridPane
//		GridPane root = new GridPane();
		
		
		
		// ..........................TODO MORE CODE.................................
		
//		stage.setScene(scene);
//		
//		stage.show();
		
		
		/**
		 * Object 'root' that call 'GridPane' class.
		 */
//		GridPane root = new GridPane();			// ***Belongs to GridPane Layout.***
		GridPane gridPaneTable = this.createGridPane();
		
		// TODO CREAT 'deleButton' object Button. [NONEED]
		
		/**
		 * ADD the GridPane and the Delte Button to the VBox[NONEED]
		 */
		VBox root = new VBox();
		root.getChildren().addAll(gridPaneTable, table);
		
		/**
		 * SET the Padding and Border for the VBox
		 */
		root.setSpacing(5);
		
		root.setStyle("-fx-padding: 10; -fx-border-style: solid inside;"
				+ "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;"
				+ "-fx-border-radius: 5;"
				+ "-fx-border-color: blue;");
		
		Scene scene = new Scene(root);
		
		
		
		/**
		 * Object 'leftbanner' that call 'FlowPane' class.			// ***Belongs to GridPane Layout.***
		 * This is the blue stripe to the left of stage.
		 */
//		FlowPane leftbanner = new FlowPane();
//		leftbanner.setPrefWidth(100);
//		
//		String bgStyle = "-fx-background-color: lightblue;"
//				+ "-fx-background-radius: 0%;"
//				+ "-fx-background-inset: 5px;";
//		leftbanner.setStyle(bgStyle);
		
//		root.add(leftbanner, 0, 0, 1, 1);		// ***Belongs to GridPane Layout.***	
//		root.add(createGridPane(), 1, 0, 1, 1);			// ***Belongs to GridPane Layout.***
		
		//Scene scene = new Scene(root, 800, 200);
//		Scene scene = new Scene(root, 800, 800);			// ***Belongs to GridPane Layout.***
//		Scene scene = new Scene(800, 800);			// ***Belongs to GridPane Layout.***
		
//		stage.setTitle("JavaFX GridPane LAYOUT");			// ***Belongs to GridPane Layout.***
		
		/**
		 * The call of 'setTableimage' method witch is that size of the table.
		 */
//		setTableimage();
		
		/**
		 * Here start the table part.
		 */		
		// TODO
		final Label label = new Label("");
		label.setFont(new Font("Arial", 20));
		
		table.setEditable(true);
		
		TableColumn first2NameCol = new TableColumn("First Name");
		firstNameCol.setMinWidth(100);
		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		// TODO
		TableColumn last2NameCol = new TableColumn("Last Name");
		lastNameCol.setMinWidth(100);
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		
		// TODO
		TableColumn aGe2Col = new TableColumn("Age");
		aGeCol.setMinWidth(100);
		aGeCol.setCellValueFactory(new PropertyValueFactory<>("age"));
		
		table.setItems(personManagerList);
		table.getColumns().addAll(first2NameCol, last2NameCol, aGe2Col);
		
		// TODO
		final TextField addFirstName = new TextField();
		addFirstName.setPromptText("First Name");
		addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
		final TextField addLastName = new TextField();
		addLastName.setMaxWidth(lastNameCol.getPrefWidth());
		addLastName.setPromptText("Last Name");
//		// TODO
		final TextField addAge = new TextField();
		addAge.setMaxWidth(aGeCol.getPrefWidth());
		addAge.setPromptText("Age");
				
		//stage.setScene(scene);
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
//	private void setTableimage() {
//		// The size of table
//		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
//		table.setPrefWidth(600);
//		table.setPrefHeight(600);		
//	}
//
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
//		final Label label = new Label("");
//		grid.add(new Label(""),0, 8, 1, 1);
//		label.setFont(new Font("Arial", 20));
//		grid.add
//		
//		table.setEditable(true);
//		
//		TableColumn firstNameCol = new TableColumn("First Name");
//		firstNameCol.setMinWidth(100);
//		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
//		
//		// TODO
//		TableColumn lastNameCol = new TableColumn("Last Name");
//		lastNameCol.setMinWidth(100);
//		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
//		
//		// TODO
//		TableColumn aGeCol = new TableColumn("Age");
//		aGeCol.setMinWidth(100);
//		aGeCol.setCellValueFactory(new PropertyValueFactory<>("age"));
//		
//		table.setItems(personManagerList);
//		table.getColumns().addAll(firstNameCol, lastNameCol, aGeCol);
//		
//		// TODO
//		final TextField addFirstName = new TextField();
//		addFirstName.setPromptText("First Name");
//		addFirstName.setMaxWidth(firstNameCol.getPrefWidth());
//		final TextField addLastName = new TextField();
//		addLastName.setMaxWidth(lastNameCol.getPrefWidth());
//		addLastName.setPromptText("Last Name");
//		// TODO
//		final TextField addAge = new TextField();
//		addAge.setMaxWidth(aGeCol.getPrefWidth());
//		addAge.setPromptText("Age");
		
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
